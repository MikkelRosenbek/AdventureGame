public class Room {

    private final String ROOMNAME;
    private final String ROOMDESCRIPTION;
    private Room room;
    private Room north, south, east, west;

    public Room (String name, String description){
        this.ROOMNAME = name;
        this.ROOMDESCRIPTION = description;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
    public Room getRoom() {
        return room;
    }
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
}
