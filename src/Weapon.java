public class Weapon extends Item {

    private int damage;
    private int remainingUses;

    public Weapon(String shortName, String longName, int damage, int remainingUses) {
        super(shortName,longName);
        this.damage = damage;
        this.remainingUses = remainingUses;
    }

    public int getDamage() {
        return damage;
    }


    public int getRemainingUses() {
        return remainingUses;
    }

    public void use() {
        if (remainingUses > 0) {
            remainingUses--;
        }
    }








}
