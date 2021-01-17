package items;

public class Creature extends Item{

    private CreatureType creatureType;

    public Creature(CreatureType creatureType) {
        this.creatureType = creatureType;
    }

    public CreatureType getCreature() {
        return this.creatureType;
    }

    public String getItemName() {
        return this.creatureType.name();
    }

}
