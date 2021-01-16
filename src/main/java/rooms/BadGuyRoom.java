package rooms;

import enemies.Enemy;
import items.Treasure;

public class BadGuyRoom extends Room {

    Enemy enemy;

    public BadGuyRoom(String name, boolean completed, Enemy enemy) {
        super(name, completed);
        this.enemy = enemy;
    }

    public Enemy getEnemy() {
        return this.enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public void checkIfCompleted() {
        if (this.enemy.getHealthPoints() <= 0) {
            super.setAsCompleted();
        }
    }
}
