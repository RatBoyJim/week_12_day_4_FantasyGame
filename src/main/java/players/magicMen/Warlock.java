package players.magicMen;

import items.Armour;
import items.Weapon;

public class Warlock extends MagicMan {
    public Warlock(int healthPoints, int defencePoints, int attackPoints, String name, Weapon weapon, Armour armour) {
        super(healthPoints, defencePoints, attackPoints, name, weapon, armour);
    }
}
