package players.magicMen;

import enemies.Enemy;
import items.*;
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
        spellsList = new ArrayList<>();
        spellsListNames = new ArrayList<>();
        creatureList = new ArrayList<>();
        creatureListNames = new ArrayList<>();
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
        return this.spell.getItemName();
    }

    public String getCurrentCreatureName() {
        return this.creature.getItemName();
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }

    public ArrayList<String> getNamesOfSpellsInSpellsList() {
        for (Item spell: spellsList) {
            spellsListNames.add(spell.getItemName());
        }
        return this.spellsListNames;
    }

    public ArrayList<String> getNamesOfCreaturesInCreaturesList() {
        for (Item creature: creatureList) {
            creatureListNames.add(creature.getItemName());
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

    public void updateAttackPointsWithEquippedSpell() {
        SpellType spellType = this.spell.getSpell();
        int spellAttackPoints = spellType.getAttackDamage();
        int playerBaseAttackPoints = getAttackPoints();
        int newTotalAttackPoints = spellAttackPoints + playerBaseAttackPoints;
        setAttackPoints(newTotalAttackPoints);
    }

    public void updateDefencePointsWithEquippedCreature() {
        CreatureType creatureType = this.creature.getCreature();
        int creatureAttackPoints = creatureType.getAttackDamage();
        int playerBaseDefencePoints = getDefencePoints();
        int newTotalAttackPoints = creatureAttackPoints + playerBaseDefencePoints;
        setDefencePoints(newTotalAttackPoints);
    }

    @Override
    public void attack(Player player, Enemy enemy) {
        int enemyHP = enemy.getHealthPoints();
        updateAttackPointsWithEquippedSpell();
        int playerAP = player.getAttackPoints();
        enemyHP -= playerAP;
        enemy.setHealthPoints(enemyHP);
    }


}
