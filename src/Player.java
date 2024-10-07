import java.util.ArrayList;

//Klassen, som holder styr på hvor spilleren befinder sig
public class Player {

    private Room currentRoom;
    private ArrayList<Item> itemsInInventory;
    private int health;



    public Player(Room startingRoom) {
        this.currentRoom = startingRoom;
        this.itemsInInventory = new ArrayList<>();
        this.health = 100;
    }

    //Giver mulighed for at tage/fjerne et item fra et rum
    public String takeItem(String itemName) {
        Item item = currentRoom.findItem(itemName);
        if (item != null) {
            itemsInInventory.add(item);
            currentRoom.removeItem(item);
            return "You took: " + itemName;
        } else {
            return itemName + " is not to be seen in this room";
        }
    }

    public String dropItem(String itemName) {
        Item item = findItem(itemName);
        if (item != null) {
            itemsInInventory.remove(item);
            currentRoom.addItem(item);
            return "You have dropped: " + item.getLongName();
        }
        return "You don't have an item called " + itemName + " in your inventory";
    }

    // Metode til at vise hvilke items der er i spillerens inventory. Den laver indholdet i ArrayList<itemsInInventory> om til Strings, som viser hvilket item som spilleren har fat i
    public String showInventory() {
        if (itemsInInventory.isEmpty()) {
            return "Your inventory is empty";
        } else {
            StringBuilder inventoryList = new StringBuilder("You have the following items in your inventory: ");
            for (Item item : itemsInInventory) {
                inventoryList.append(item.getShortName()).append(", ");
            }
            return  inventoryList.substring(0, inventoryList.length() -2) ;
        }
    }

    // Finder et item i ArrayListen <itemsInInvetory> ud fra shortName på item
    public Item findItem (String itemName) {
        for (Item item : itemsInInventory) {
            if (item.getShortName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }

    public Room getCurrentRoom(){
        return currentRoom;
    }

    public boolean move (String direction) {
        Room nextRoom = null;
        switch (direction) {
            case "north", "n" -> {
                nextRoom = currentRoom.getNorth();
            }
            case "south", "s" -> {
                nextRoom = currentRoom.getSouth();
            }
            case "east", "e" -> {
                nextRoom = currentRoom.getEast();
            }
            case "west", "w" -> {
                nextRoom = currentRoom.getWest();
            }
        }
        if (nextRoom != null) {
            currentRoom = nextRoom;
            return true;
        } else {
            return false;
        }
    }




        public String eat(String foodName) {
            Item item = findItem(foodName);

            //Hvis foodItem ikke er i rummet eller i inventory printes nedenstående ud
            if (item == null) {
                item = currentRoom.findItem(foodName);
                if (item == null) return foodName + " is not here or in your inventory.";
            }

            // Hvis item ikke er et foodItem, printes nedenstående ud
            if (!(item instanceof Food)) {
                return "You can't eat " + foodName;
            }

            Food food = (Food) item; // Gør item til et food item
            health += food.getHealthPoints();
            String healthEffect = food.getHealthPoints() > 0 ? "It restored " : "It reduced ";
            String message = "You ate/drank " + foodName + ". " + healthEffect + Math.abs(food.getHealthPoints()) + " health points.";

            // Fjerner foodItem fra rummet eller inventory
            itemsInInventory.remove(item);
            currentRoom.removeItem(item);

            return message + "\nCurrent health: " + health;
        }

        // "Health" command
        public String showHealth() {
            return "Health: " + health + " - " + healthStatus();
        }

        // String, som definerer hvad der printes alt efter hvor meget HP spilleren har
        private String healthStatus() {
            if (health > 75) return "You are in great health!";
            else if (health > 50) return "You are in good health, but avoid fighting right now.";
            else if (health > 25) return "You are alomost dead. Try to find some food";
            else return "You are on the brink of collapse!";
        }
}




