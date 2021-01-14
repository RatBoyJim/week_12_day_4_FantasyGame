package players.fighters;

import players.Player;
import items.Weapon;
import items.Armour;



public class Fighter extends Player {

    private Weapon weapon;
    private Armour armour;
    private String name;


    public Fighter(int healthPoints, int defencePoints, int attackPoints, String name) {
        super(healthPoints, defencePoints, attackPoints);
        this.weapon = new Weapon();
        this.armour = new Armour();
        this.name = name;
    }
}
