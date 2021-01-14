package players.fighters;


import items.Armour;
import items.Weapon;

public class Barbarian extends Fighter {

    public Barbarian(int healthPoints, int defencePoints, int attackPoints, String name, Weapon weapon, Armour armour) {
        super(healthPoints, defencePoints, attackPoints, name, weapon, armour);
    }
}
