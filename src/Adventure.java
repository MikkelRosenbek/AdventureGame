//Controller - Den klasse som styrer hele programmets flow
public class Adventure {

    private Player player;

    public Adventure(Map map){
        this.player = new Player(map.getStartingRoom());
    }

    public String look() {
        return "You are in " + player.getCurrentRoom().getROOMNAME() + "\n" + player.getCurrentRoom().getROOMDESCRIPTION();
    }

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
            return "You are now in " + player.getCurrentRoom().getROOMNAME() + "\n" + player.getCurrentRoom().getROOMDESCRIPTION();
        } else {
            return "You cannot go this way";
        }
    }
}
