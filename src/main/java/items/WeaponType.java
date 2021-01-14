package items;

public enum WeaponType {

    AXE(8),
    SWORD(7),
    CLUB(5),
    STAFF(3),
    SPEAR(6),
    HAMMER(4),
    SCYTHE(6),
    BOW(3),
    FIREBALL(8);

    private final int attackDamage;

    WeaponType(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getAttackDamage() {
        return this.attackDamage;
    }
}
