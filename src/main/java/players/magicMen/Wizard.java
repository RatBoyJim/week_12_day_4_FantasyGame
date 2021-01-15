package players.magicMen;

import items.Spell;
import items.Creature;

public class Wizard extends MagicMan {
    public Wizard(int healthPoints, int defencePoints, int attackPoints, String name, Spell spell, Creature creature) {
        super(healthPoints, defencePoints, attackPoints, name, spell, creature);
    }
}
