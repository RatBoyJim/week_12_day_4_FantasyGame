package enemies;

import items.Armour;
import items.Weapon;

public class Orc extends Enemy{
        private Weapon weapon;
        private Armour armour;


        public Orc(int healthPoints, int attackPoints, String name, Weapon weapon, Armour armour) {
            super(healthPoints, attackPoints, name);
            this.weapon = weapon;
            this.armour = armour;
        }
    }

