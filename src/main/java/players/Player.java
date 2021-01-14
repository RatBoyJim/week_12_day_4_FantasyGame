package players;

import java.util.ArrayList;

public abstract class Player {

        private int healthPoints;
        private ArrayList<Item> inventory;
        private int defencePoints;
        private int attackPoints;

        public Player(int healthPoints, int defencePoints, int attackPoints) {
            this.healthPoints = healthPoints;
            this.defencePoints = defencePoints;
            this.attackPoints = attackPoints;
            this.inventory = new ArrayList<Item>();
    }

    public int getHealthPoints() {
        return this.healthPoints;
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
}
