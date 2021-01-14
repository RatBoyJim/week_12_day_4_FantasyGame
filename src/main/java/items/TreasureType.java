package items;

public enum TreasureType {

    GOLD(8),
    JEWELS(6),
    PS5(100),
    DIAMONDS(9);

    private final int treasureValue;

    TreasureType(int treasureValue) {
        this.treasureValue = treasureValue;
    }

    public int getTreasureValues() {
        return this.treasureValue;
    }
}
