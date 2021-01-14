package items;

public enum ArmourType {

    SHIELD(8),
    HELMET(6),
    ARMOUR(9);

    private final int defencePoints;

    ArmourType(int attackDamage) {
        this.defencePoints = attackDamage;
    }

    public int getDefencePoints() {
        return this.defencePoints;
    }
}
