package items;

public class HealingTool extends Item{

    private HealingToolType healingToolType;

    public HealingTool(HealingToolType healingToolType) {
        this.healingToolType = healingToolType;
    }

    public HealingToolType getHealingTool() {
        return this.healingToolType;
    }

    public String getItemName() {
        return this.healingToolType.name();
    }
}
