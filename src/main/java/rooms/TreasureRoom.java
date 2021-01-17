package rooms;

import items.Treasure;

public class TreasureRoom extends Room {

    Treasure treasure;

    public TreasureRoom(String name, boolean completed, Treasure treasure) {
        super(name, completed);
        this.treasure = treasure;
    }

    public Treasure getTreasure() {
        return this.treasure;
    }

    public void setTreasure(Treasure treasure) {
        this.treasure = treasure;
    }

    public String getCurrentTreasureName() {
        return this.treasure.getTreasure().name();
    }

    public void treasureCollected() {
        this.treasure = null;
        this.setAsCompleted();
    }
}
