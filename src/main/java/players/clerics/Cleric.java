package players.clerics;

import items.HealingTool;
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

    public void createhealingToolList() {
        for (Item item: this.getInventory()) {
            if (item instanceof HealingTool){
                healingToolList.add(item);
            }
        }
    }

    public int getSizeOfhealingToolList() {
        return this.healingToolList.size();
    }

    public String getCurrentHealingToolName() {
        return this.healingTool.getHealingToolName();
    };

    public void setHealingTool(HealingTool healingTool) {
        this.healingTool = healingTool;
    }

    public ArrayList<String> getNamesOfHealingToolsInhealingToolList() {
        for (Item healingTool: healingToolList) {
            healingToolListNames.add(((HealingTool) healingTool).getHealingToolName());
        }
        return this.healingToolListNames;
    }

    public void swapHealingToolFromInventory(Item itemWanted) {
        addItemToInventory(this.healingTool);
        removeItemFromInventory(itemWanted);
        setHealingTool((HealingTool)itemWanted);

    }
}
