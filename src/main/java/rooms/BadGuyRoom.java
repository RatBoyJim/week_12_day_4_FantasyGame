package rooms;

import enemies.Enemy;

public class BadGuyRoom extends Room {

    Enemy enemy;

    public BadGuyRoom(String name, boolean completed, Enemy enemy) {
        super(name, completed);
        this.enemy = enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }
}
