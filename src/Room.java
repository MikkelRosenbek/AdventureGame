import java.util.ArrayList;

public class Room {

    private final String ROOMNAME;
    private final String ROOMDESCRIPTION;
    // kan muligvis slettes        private Room room;
    private Room north, south, east, west;
    private ArrayList<Item> itemsInRoom = new ArrayList<>();

    // Constructor
    public Room (String name, String description){
        this.ROOMNAME = name;
        this.ROOMDESCRIPTION = description;
    }

    //Methods
//    public void setRoom(Room room) { kan slettes
//        this.room = room;
//    }
//    public Room getRoom() { kan slettes
//        return room;
//    }
    public String getROOMNAME() {
        return ROOMNAME;
    }
    public String getROOMDESCRIPTION() {
        return ROOMDESCRIPTION;
    }


    public void setNorth(Room north) {
        this.north = north;
    }
    public Room getNorth() {
        return north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }
    public Room getSouth() {
        return south;
    }


    public void setEast(Room east) {
        this.east = east;
    }
    public Room getEast() {
        return east;
    }


    public void setWest(Room west) {
        this.west = west;
    }
    public Room getWest() {
        return west;
    }

    public void addItemToRoom(String itemName, String itemDescription) {
        itemsInRoom.add(new Item(itemName, itemDescription)); //new Item giver adgang til data fra Item-klassen
    }

    public ArrayList<Item> getItemsInRoom() {
        return itemsInRoom;
    }

    public Item takeItem(String itemName) {
        for (Item item : new ArrayList<>(itemsInRoom)) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                itemsInRoom.remove(item);
                return item;
            }
        }
        return null;
    }


}