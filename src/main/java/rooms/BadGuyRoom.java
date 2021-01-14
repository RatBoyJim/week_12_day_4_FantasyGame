package rooms;

import enemies.Enemy;

public class BadGuyRoom extends Room {

    Enemy enemy;

    public BadGuyRoom(String name, Enemy enemy) {
        super(name);
        this.enemy = enemy;
    }
}
