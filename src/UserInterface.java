import java.util.Scanner;

public class UserInterface {
    private Adventure adventure;
    private Scanner input;

    public UserInterface(Adventure adventure) {
        this.adventure = adventure;
        this.input = new Scanner(System.in);
    }

    public void startGame() {
        boolean isRunning = true;

        System.out.println("Welcome to Tales of Magic: The Legendary Quest" + "\n\nHere is a list of the possible commands:" + "\n\t1. Look" + "\n\t2. Go north, south, east, west" + "\n\t3. Exit" + "\nIn case you need any help - type help" +"\n");

        while (isRunning) {
            System.out.println("Please enter a command");
            String command = input.nextLine().toLowerCase();

            //  Switch-case som giver input (command) et output
            switch (command) {

                case "look" -> {
                    System.out.println(adventure.look());
                }
                case "help" -> {
                    System.out.println("List of commands: " + "\n\tLook" + "\n\tGo north, south, east, west" + "\n\tExit" + "\n\tHelp");
                }
                case "exit" -> {
                    System.out.println("You are exiting the game");
                    isRunning = false;
                }
                case "go north", "going north", "n", "north" -> {
                    System.out.println(adventure.move("north"));
                }
                case "go south", "going south", "s", "south" -> {
                    System.out.println(adventure.move("south"));
                }
                case "go east", "going east", "e", "east" -> {
                    System.out.println(adventure.move("east"));
                }
                case "go west", "going west", "w", "west" -> {
                    System.out.println(adventure.move("west"));
                }
                default -> {
                    System.out.println("Unknown command. type help to see your options");
                }

            }


        }

    }
}