import items.*;
import org.junit.Before;
import org.junit.Test;
import players.clerics.Druid;
import players.fighters.Viking;

import static org.junit.Assert.assertEquals;

public class DruidTest {

    Druid druid;
    Item spliff;
    Item elixir;
    HealingTool healingTool;
    HealingTool healingTool2;
    Treasure treasure;
    Viking viking;
    Weapon weapon;
    Armour armour;

    @Before
    public void setUp() {
        spliff = new HealingTool(HealingToolType.SPLIFF);
        elixir = new HealingTool(HealingToolType.ELIXIR);
        healingTool = new HealingTool(HealingToolType.ELIXIR);
        healingTool2 = new HealingTool(HealingToolType.DRUGS);
        treasure = new Treasure(TreasureType.PS5);
        weapon = new Weapon(WeaponType.AXE);
        armour = new Armour(ArmourType.SHIELD);
        druid = new Druid(150, 15, 20, "Getafix", healingTool);
        viking = new Viking(100, 25, 75, "Mads", weapon, armour);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(150, druid.getHealthPoints());
    }

    @Test
    public void hasDefencePoints() {
        assertEquals(15, druid.getDefencePoints());
    }

    @Test
    public void hasAttackPoints() {
        assertEquals(20, druid.getAttackPoints());
    }

    @Test
    public void hasName() {
        assertEquals("Getafix", druid.getName());
    }

    @Test
    public void canAddToInventory() {
        druid.addItemToInventory(spliff);
        druid.addItemToInventory(treasure);
        druid.addItemToInventory(elixir);
        assertEquals(3, druid.countInventory());
    }

    @Test
    public void canRemoveFromInventory() {
        druid.addItemToInventory(spliff);
        druid.addItemToInventory(treasure);
        druid.addItemToInventory(elixir);
        druid.removeItemFromInventory(spliff);
        assertEquals(2, druid.countInventory());
    }

//    @Test
//    public void canSwapItemInInventory() {
//        assertEquals("ELIXIR", druid.getCurrentHealingToolName());
//        assertEquals(0, druid.countInventory());
//        druid.addItemToInventory(spliff);
//        assertEquals(1, druid.countInventory());
//        druid.swapHealingToolFromInventory(spliff);
//        druid.createhealingToolList();
//        assertEquals("SPLIFF", druid.getCurrentHealingToolName());
//        assertEquals("ELIXIR", druid.getNamesOfHealingToolsInhealingToolList());
//    }


    @Test
    public void canCreateHealingToolList() {
        druid.addItemToInventory(spliff);
        druid.addItemToInventory(elixir);
        druid.addItemToInventory(treasure);
        druid.createHealingToolList();
        assertEquals(2, druid.getSizeOfHealingToolList());
    }

    @Test
    public void startsWithWeapon() {
        assertEquals("ELIXIR", druid.getCurrentHealingToolName());
    }

    @Test
    public void canChangeWeapon() {
        druid.setHealingTool(healingTool2);
        assertEquals("DRUGS", druid.getCurrentHealingToolName());
    }

    @Test
    public void canHeal() {
        druid.heal(druid, viking);
        assertEquals(130, viking.getHealthPoints());
    }

}
