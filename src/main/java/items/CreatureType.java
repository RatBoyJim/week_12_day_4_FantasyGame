package items;

public enum CreatureType {

    GIANT_RAT(2),
    DRAGON(9),
    MANTICORE(8),
    GIANT(8),
    DWARF(4);

    private final int attackDamage;

    CreatureType(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getAttackDamage() {
        return this.attackDamage;
    }

}
