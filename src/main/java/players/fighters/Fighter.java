package players.fighters;

import players.Player;
import items.Weapon;
import items.Armour;

    private Weapon weapon;
    private Armour armour;

public class Fighter extends Player {
    public Fighter(int healthPoints, int defencePoints, int attackPoints) {
        super(healthPoints, defencePoints, attackPoints);
        this.weapon = new Weapon();
        this.armour = new Armour();
    }
}
