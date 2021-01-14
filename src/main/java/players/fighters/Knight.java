package players.fighters;

import items.Armour;
import items.Weapon;

public class Knight extends Fighter{

    public Knight(int healthPoints, int defencePoints, int attackPoints, String name, Weapon weapon, Armour armour) {
        super(healthPoints, defencePoints, attackPoints, name, weapon, armour);
    }
}
