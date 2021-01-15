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
    private ArrayList<Item> creatureList;
    private ArrayList<String> creatureListNames;

    public MagicMan(int healthPoints, int defencePoints, int attackPoints, String name, Spell spell, Creature creature) {
        super(healthPoints, defencePoints, attackPoints, name);
        this.spell = spell;
        this.creature = creature;
        spellsList = new ArrayList<Item>();
        spellsListNames = new ArrayList<String>();
        creatureList = new ArrayList<Item>();
        creatureListNames = new ArrayList<String>();
    }

    public void createSpellsList() {
        for (Item item: this.getInventory()) {
            if (item instanceof Spell){
                spellsList.add(item);
            }
        }
    }

    public void createCreatureList() {
        for (Item item: this.getInventory()) {
            if (item instanceof Creature){
                creatureList.add(item);
            }
        }
    }

    public int getSizeOfSpellsList() {
        return this.spellsList.size();
    }

    public int getSizeOfCreatureList() {
        return this.creatureList.size();
    }

    public String getCurrentSpellName() {
        return this.spell.getSpellName();
    };

    public String getCurrentCreatureName() {
        return this.creature.getCreatureName();
    };

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }

    public ArrayList<String> getNamesOfSpellsInSpellsList() {
        for (Item spell: spellsList) {
            spellsListNames.add(((Spell) spell).getSpellName());
        }
        return this.spellsListNames;
    }

    public ArrayList<String> getNamesOfCreaturesInCreaturesList() {
        for (Item creature: creatureList) {
            creatureListNames.add(((Creature) creature).getCreatureName());
        }
        return this.spellsListNames;
    }

    public void swapSpellFromInventory(Item itemWanted) {
        addItemToInventory(this.spell);
        removeItemFromInventory(itemWanted);
        setSpell((Spell)itemWanted);

    }

    public void swapCreatureFromInventory(Item itemWanted) {
        addItemToInventory(this.creature);
        removeItemFromInventory(itemWanted);
        setCreature((Creature) itemWanted);

    }


}
