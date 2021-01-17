package items;

public class Armour extends Item {

    private ArmourType armourType;

    public Armour(ArmourType armourType) {
        this.armourType = armourType;
    }


    public ArmourType getArmour(){
        return this.armourType;
    }

    public String getItemName() {
        return this.armourType.name();
    }
}
