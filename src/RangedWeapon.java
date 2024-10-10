public class RangedWeapon extends Weapon{



    public RangedWeapon (String shortName, String longName, int damage, int remainingUses) {
        super(shortName,longName, damage, remainingUses);
    }


    @Override
    public int getRemainingUses() {
      return super.getRemainingUses();
    }

}
