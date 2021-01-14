package enemies;

import java.util.ArrayList;
import items.Item;

public abstract class Enemy {

    private int healthPoints;
    private int attackPoints;
    private String name;

    public Enemy(int healthPoints, int attackPoints, String name) {
        this.healthPoints = healthPoints;
        this.attackPoints = attackPoints;
        this.name = name;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public int getAttackPoints() {
        return this.attackPoints;
    }

    public String getName() {return this.name;}

}
