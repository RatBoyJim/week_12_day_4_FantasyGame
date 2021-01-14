package rooms;

import items.Treasure;

public class TreasureRoom extends Room {

    Treasure treasure;

    public TreasureRoom(String name, Treasure treasure) {
        super(name);
        this.treasure = treasure;
    }
}
