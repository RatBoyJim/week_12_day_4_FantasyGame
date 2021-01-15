package items;

public class Armour extends Item {

    private ArmourType armourType;

    public Armour(ArmourType armourType) {
        this.armourType = armourType;
    }


    public ArmourType getTreasure(){
        return this.armourType;
    }
}
