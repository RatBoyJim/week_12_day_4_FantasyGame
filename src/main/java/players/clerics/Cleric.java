package players.clerics;

import enemies.Enemy;
import items.HealingTool;
import items.HealingToolType;
import items.Item;
import players.Player;

import java.util.ArrayList;

public class Cleric extends Player {

    private HealingTool healingTool;
    private ArrayList<Item> healingToolList;
    private ArrayList<String> healingToolListNames;


    public Cleric(int healthPoints, int defencePoints, int attackPoints, String name, HealingTool healingTool) {
        super(healthPoints, defencePoints, attackPoints, name);
        this.healingTool = healingTool;
        healingToolList = new ArrayList<Item>();
        healingToolListNames = new ArrayList<String>();
    }

    public void createHealingToolList() {
        for (Item item: this.getInventory()) {
            if (item instanceof HealingTool){
                healingToolList.add(item);
            }
        }
    }

    public int getSizeOfHealingToolList() {
        return this.healingToolList.size();
    }

    public String getCurrentHealingToolName() {
        return this.healingTool.getItemName();
    }

    public void setHealingTool(HealingTool healingTool) {
        this.healingTool = healingTool;
    }

    public ArrayList<String> getNamesOfHealingToolsInHealingToolList() {
        for (Item healingTool: healingToolList) {
            healingToolListNames.add(((HealingTool) healingTool).getItemName());
        }
        return this.healingToolListNames;
    }

    public void swapHealingToolFromInventory(Item itemWanted) {
        addItemToInventory(this.healingTool);
        removeItemFromInventory(itemWanted);
        setHealingTool((HealingTool)itemWanted);

    }

    public void updateAttackPointsWithEquippedHealingTool() {
        HealingToolType healingToolType = this.healingTool.getHealingTool();
        int healingToolRecoveryPoints = healingToolType.getHealthRecovery();
        int playerBaseAttackPoints = getAttackPoints();
        int newTotalHealingPoints = healingToolRecoveryPoints + playerBaseAttackPoints;
        setAttackPoints(newTotalHealingPoints);
    }

    @Override
    public void attack(Player player, Enemy enemy) {
        int enemyHP = enemy.getHealthPoints();
        int clericAP = player.getAttackPoints();
        enemyHP -= clericAP;
        enemy.setHealthPoints(enemyHP);
    }

    public void heal(Player player, Player playerToHeal) {
        int playerToHealHP = playerToHeal.getHealthPoints();
        updateAttackPointsWithEquippedHealingTool();
        int healerAP = player.getAttackPoints();
        playerToHealHP += healerAP;
        playerToHeal.setHealthPoints(playerToHealHP);
    }
}
