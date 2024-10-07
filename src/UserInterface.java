import java.util.Scanner;

public class UserInterface {
    private Adventure adventure;

    public UserInterface(Adventure adventure) {
        this.adventure = adventure;
    }

    public String Input() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a command");
        return userInput.nextLine();
    }

    public void print(String message) {
        System.out.println(message);
    }
}