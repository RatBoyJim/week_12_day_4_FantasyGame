package enemies;

import items.Armour;
import items.Weapon;

public class Troll extends Enemy {

    private Weapon weapon;
    private Armour armour;

    public Troll(int healthPoints, int attackPoints, String name, Weapon weapon, Armour armour) {
        super(healthPoints, attackPoints, name);
        this.weapon = weapon;
        this.armour = armour;
    }
}
