import java.util.ArrayList;

public class Room {

    private  String roomName;
    private String roomDescription;
    private Room north, south, east, west;
    private ArrayList<Item> itemsInRoom = new ArrayList<>();

    // Constructor
    public Room (String name, String description){
        this.roomName = name;
        this.roomDescription = description;
    }


    public String getRoomDescription() {
        String description = roomName + roomDescription; //Hvis der mangler roomName når beskrivelsen printes, så put roomName ind her -----------------------------------------------------------
        if (!itemsInRoom.isEmpty()) {
            description += "Items in this room: ";
            for (Item item : itemsInRoom) {
                description += "\n\t - " + item.getShortName();
            }
        } else {
            description += "\n There are no items in this room";
        }
        return description;
    }


    public void addItem(Item item) {
        itemsInRoom.add(item);
    }


    public Item findItem (String itemName) {
        for (Item item : itemsInRoom) {
            if (item.getShortName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }

    public void removeItem(Item item) {
        itemsInRoom.remove(item);
    }

    // ---------    Nord    ---------------
    public void setNorth(Room north) {
        this.north = north;
    }
    public Room getNorth() {
        return north;
    }

    // ---------    Syd    ---------------
    public void setSouth(Room south) {
        this.south = south;
    }
    public Room getSouth() {
        return south;
    }

    // ---------    Øst    ---------------
    public void setEast(Room east) {
        this.east = east;
    }
    public Room getEast() {
        return east;
    }

    // ---------    Vest    ---------------
    public void setWest(Room west) {
        this.west = west;
    }
    public Room getWest() {
        return west;
    }


}