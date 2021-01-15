package players.magicMen;


import items.Creature;
import items.Item;
import items.Spell;
import players.Player;

import java.util.ArrayList;

public class MagicMan extends Player {

    private Spell spell;
    private Creature creature;
    private ArrayList<Item> spellsList;
    private ArrayList<String> spellsListNames;
    private ArrayList<Creature> creatureList;
    private ArrayList<String> creatureListNames;

    public MagicMan(int healthPoints, int defencePoints, int attackPoints, String name, Spell spell, Creature creature) {
        super(healthPoints, defencePoints, attackPoints, name);
        this.spell = spell;
        this.creature = creature;
        spellsList = new ArrayList<Item>();
        spellsListNames = new ArrayList<String>();
        creatureList = new ArrayList<Creature>();
        creatureListNames = new ArrayList<String>();
    }
}
