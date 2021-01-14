package players.fighters;

import items.WeaponType;
import players.Player;
import items.Weapon;
import items.Armour;



public class Fighter extends Player {

    private Weapon weapon;
    private Armour armour;


    public Fighter(int healthPoints, int defencePoints, int attackPoints, String name, Weapon weapon, Armour armour) {
        super(healthPoints, defencePoints, attackPoints, name);
        this.weapon = weapon;
        this.armour = armour;
    }
}
