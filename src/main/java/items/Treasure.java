package items;

public class Treasure extends Item {

    private TreasureType treasureType;

    public Treasure(TreasureType treasureType) {
        this.treasureType = treasureType;
    }


    public TreasureType getTreasure(){
        return this.treasureType;
    }
}
