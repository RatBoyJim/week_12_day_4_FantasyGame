package rooms;

import enemies.Enemy;

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

    public boolean checkIfCompleted() {
        if (this.enemy.getHealthPoints() <= 0) {
            super.setAsCompleted();
            return true;
        }
        return false;
    }

}
