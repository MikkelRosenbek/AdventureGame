import java.util.ArrayList;

//Klassen, som holder styr på hvor spilleren befinder sig
public class Player {

    private Room currentRoom;
    private ArrayList<Item> itemsInInventory = new ArrayList<>();



    public Player(Room startingRoom) {
        this.currentRoom = startingRoom;
    }

    public Room getCurrentRoom(){
        return currentRoom;
    }

    public void setCurrentRoom(Room newRoom) {
        this.currentRoom = newRoom;
    }



    public ArrayList<Item> getItemsInInventory() {
        return itemsInInventory;
    }

    public Item dropItem(String itemName) {
        for (Item item : new ArrayList<>(itemsInInventory)) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                itemsInInventory.remove(item);
                currentRoom.addItemToRoom(item.getItemName(), item.getItemDescription());
                return item;
            }
        }
        return null;
    }




}
