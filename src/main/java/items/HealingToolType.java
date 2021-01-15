package items;

public enum HealingToolType {

    HERBS(4),
    DRUGS(7),
    ELIXIR(10),
    SPLIFF(2);

    private final int healthRecovery;

    HealingToolType(int healthRecovery) {
        this.healthRecovery = healthRecovery;
    }

    public int getHealthRecovery() {
        return this.healthRecovery;
    }
}
