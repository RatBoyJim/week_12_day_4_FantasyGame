import items.*;
import org.junit.Before;
import org.junit.Test;
import players.fighters.Viking;

import static org.junit.Assert.assertEquals;

public class VikingTest {

    Viking viking;
    Item axe;
    Weapon weapon;
    Armour armour;
    Treasure treasure;

    @Before
    public void setUp(){
    viking = new Viking(100, 25, 75, "Mads", weapon, armour);
    axe = new Weapon(WeaponType.AXE);
    treasure = new Treasure(TreasureType.PS5);
    armour = new Armour(ArmourType.SHIELD);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, viking.getHealthPoints());
    }

    @Test
    public void hasDefencePoints() {
        assertEquals(25, viking.getDefencePoints());
    }

    @Test
    public void hasAttackPoints() {
        assertEquals(75, viking.getAttackPoints());
    }

    @Test
    public void hasName() {
        assertEquals("Mads", viking.getName());
    }

    @Test
    public void canAddToInventory() {
        viking.addItemToInventory(axe);
        viking.addItemToInventory(treasure);
        viking.addItemToInventory(armour);
        assertEquals(3, viking.countInventory());
    }

}
