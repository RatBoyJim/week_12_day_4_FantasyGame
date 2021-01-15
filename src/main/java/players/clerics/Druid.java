package players.clerics;

import items.HealingTool;

public class Druid extends Cleric{
    public Druid(int healthPoints, int defencePoints, int attackPoints, String name, HealingTool healingTool) {
        super(healthPoints, defencePoints, attackPoints, name, healingTool);
    }
}
