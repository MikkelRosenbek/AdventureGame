public class Main {
    public static void main(String[] args) {
    Map map = new Map();
    Adventure adventure = new Adventure(map);
    UserInterface userInterface = new UserInterface(adventure);
    userInterface.startGame();
    }
}