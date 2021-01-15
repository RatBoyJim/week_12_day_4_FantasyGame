package players.magicMen;

import items.Spell;
import items.Creature;

public class Warlock extends MagicMan {
    public Warlock(int healthPoints, int defencePoints, int attackPoints, String name, Spell spell, Creature creature) {
        super(healthPoints, defencePoints, attackPoints, name, spell, creature);
    }
}
