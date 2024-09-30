import java.util.ArrayList;

//Controller - Den klasse som styrer hele programmets flow
public class Adventure {

    private Player player;
//    private Room room;


    public Adventure(Map map){
       player = new Player(map.getStartingRoom());
    }

    public String look() {
        return "You are in " + player.getCurrentRoom().getROOMNAME() + "\n" + player.getCurrentRoom().getROOMDESCRIPTION() + "\n" + player.getCurrentRoom().getItemsInRoom();
    }

    public Item take (String itemName) {
        return player.getCurrentRoom().takeItem(itemName);
    }

    public Item drop (String itemName) {
        return player.dropItem(itemName);
    }

    public ArrayList<Item> inventory() {
        return player.getItemsInInventory();
    }

//    public ArrayList<Item> itemsInRoom() {
//        return room.getItemsInRoom();
//    }

    public String move (String direction) {
        Room nextRoom;
        switch (direction) {
            case "north" -> {
                nextRoom = player.getCurrentRoom().getNorth();
            }
            case "south" -> {
                nextRoom = player.getCurrentRoom().getSouth();
            }
            case "east" -> {
                nextRoom = player.getCurrentRoom().getEast();
            }
            case "west" -> {
                nextRoom = player.getCurrentRoom().getWest();
            }
            default -> {
                return "Invalid direction";
            }
        }

        if ( nextRoom != null) {
            player.setCurrentRoom(nextRoom);
            return "You are now in " + player.getCurrentRoom().getROOMNAME() + "\n" + player.getCurrentRoom().getROOMDESCRIPTION() + player.getCurrentRoom().getItemsInRoom();
        } else {
            return "You cannot go this way";
        }
    }
}
