public class Food extends Item {

    private int healthPoints;

    // Constructor for Food
    public Food(String shortName, String longName, int healthPoints) {
        super(shortName, longName); // Henter shortName og longName fra Superklassen (Item)
        this.healthPoints = healthPoints;
    }

    // Metode til at få healthpoints
    public int getHealthPoints() {
        return healthPoints;
    }
}
