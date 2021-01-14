package players.magicMen;

import items.Armour;
import items.Weapon;
import items.WeaponType;
import players.Player;

public class MagicMan extends Player {

    private Weapon weapon;
    private Armour armour;

    public MagicMan(int healthPoints, int defencePoints, int attackPoints, String name, Weapon weapon, Armour armour) {
        super(healthPoints, defencePoints, attackPoints, name);
        this.weapon = weapon;
        this.armour = armour;
    }
}
