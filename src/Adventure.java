import java.util.ArrayList;
import java.util.Locale;

//Controller klasse - Den klasse som styrer hele programmets flow
public class Adventure {
    private Player player;
    private Map map;
    private UserInterface userInterface;


    public Adventure(){
        map = new Map();
        userInterface = new UserInterface(this); //Hvorfor skal der stå "this" i ()? ------------------------------------------------
        Room startingRoom = map.createRooms();
        player = new Player(startingRoom);
        //userInterface = new UserInterface(this); // Hvorfor er den her dobbelt --------------------------------------------
    }

    public void startGame() {
        System.out.println("Welcome to Tales of Magic: The Legendary Quest" +
                "\n\nHere is a list of the possible commands:" + "\n\t1. Look" + "\n\t2. Go north, south, east, west" +
                "\n\t3. Exit" + "\nIn case you need any help - type help" +"\n");

        boolean running = true; // Hvis running = true, så kører spillet - Hvis false, kører spillet ikke
        while (running) {
            String userInput = userInterface.Input();
            String[] word = userInput.split(" "); // Forklar hvad et String.split gør --------------------------------
            String command = word[0].toLowerCase(Locale.ROOT); // Forklar hvad fanden det her er ---------------------------------------

            //  Switch-case som giver input(command) et output ---------------------------------------------------------------------------------------------
            switch (command) {
                case "exit"-> {
                    userInterface.print("Thank you for playing" + "\n You are exiting the game");
                    return;
                }
                case "help" -> {
                    userInterface.print("List of commands: " + "\n\t-Look" + "\n\t-Go north, south, east, west" + "\n\t-take" + "\n\t-Exit" + "\n\t-Help");
                }
                case "look" -> {
                    userInterface.print(player.getCurrentRoom().getRoomDescription());
                }
                case "go", "g" -> {
                    userInterface.print("you are going " + word[1]);
                    if (word.length > 1) {
                        userInterface.print(move(word[1]));
                    } else {
                        userInterface.print("Please write the direction you want to go");
                    }
                }
                case "take" -> {
                    if (word.length > 1) {
                        userInterface.print(player.takeItem(word[1]));
                    } else {
                        userInterface.print("Which item do you want to take?"); //Tjek op på hvad der sker hvis man skriver "Take" med stort og småt "T" --------------
                    }
                }
                case "drop" -> {
                    if (word.length > 1) {
                        userInterface.print(player.dropItem(word[1]));
                    }
                }
                case "inventory", "inv" -> {
                    userInterface.print(player.showInventory());
                }
                case "health" -> {
                    userInterface.print(player.showHealth());
                }
                case "eat", "drink" -> {
                    if (word.length > 1) {
                        userInterface.print(player.eat(word[1]));
                    }
                }
                default ->
                    System.out.println("Unknown command. type help to see your options");
                    // Kan erstattes til userInterface.print("Unknown command. type help to see your options"); -----------------------------------------------
            }
        }
    }

    public String move(String direction) {
        boolean moved = player.move(direction);
        if (moved) {
            return "you are now in room " + player.getCurrentRoom().getRoomDescription();
        } else {
            return "You cannot go this way";
        }
    }
}
