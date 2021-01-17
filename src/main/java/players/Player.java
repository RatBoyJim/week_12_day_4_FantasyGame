package players;

import java.util.ArrayList;

import behaviours.IAttack;
import enemies.Enemy;
import items.Item;
import items.Weapon;

public abstract class Player implements IAttack {

        private int healthPoints;
        private ArrayList<Item> inventory;
        private int defencePoints;
        private int attackPoints;
        private String name;
        private ArrayList<String> inventoryItemNames;

        public Player(int healthPoints, int defencePoints, int attackPoints, String name) {
            this.healthPoints = healthPoints;
            this.defencePoints = defencePoints;
            this.attackPoints = attackPoints;
            this.inventory = new ArrayList<Item>();
            this.name = name;
            this.inventoryItemNames = new ArrayList<String>();
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public ArrayList<Item> getInventory() {
        return this.inventory;
    }

    public int getDefencePoints() {
        return this.defencePoints;
    }

    public int getAttackPoints() {
        return this.attackPoints;
    }

    public String getName() {return this.name;}

    public void addItemToInventory(Item item) {
            this.inventory.add(item);
    }

    public void removeItemFromInventory(Item item) {
            this.inventory.remove(item);
    }


    public int countInventory() {
            return this.inventory.size();
    }

    public ArrayList<String> getNamesOfItemsInInventory() {
        for (Item item: inventory) {
            inventoryItemNames.add(item.getItemName());
        }
        return this.inventoryItemNames;
    }

    public abstract void attack(Player player, Enemy enemy);
}
