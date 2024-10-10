public class Enemy {

    private String enemyName;
    private String enemyDescription;
    private int enemyHealth;
    private Weapon weapon;



    public Enemy(String enemyName, String enemyDescription, int enemyHealth, Weapon weapon) {
        this.enemyName = enemyName;
        this.enemyDescription = enemyDescription;
        this.enemyHealth = enemyHealth;
        this.weapon = weapon;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public String getEnemyDescription() {
        return enemyDescription;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public void setEnemyHealth(int enemyHealth) {
        this.enemyHealth = enemyHealth;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
