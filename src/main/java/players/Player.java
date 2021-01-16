package players;

import java.util.ArrayList;
import items.Item;

public abstract class Player {

        private int healthPoints;
        private ArrayList<Item> inventory;
        private int defencePoints;
        private int attackPoints;
        private String name;

        public Player(int healthPoints, int defencePoints, int attackPoints, String name) {
            this.healthPoints = healthPoints;
            this.defencePoints = defencePoints;
            this.attackPoints = attackPoints;
            this.inventory = new ArrayList<Item>();
            this.name = name;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
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


}
