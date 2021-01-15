package items;

public enum SpellType {

    FIREBALL(8),
    STUN(2),
    ICE_RAGE(8),
    NIPPLE_TWEAK(5);

    private final int attackDamage;

    SpellType(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getAttackDamage() {
        return this.attackDamage;
    }
}
