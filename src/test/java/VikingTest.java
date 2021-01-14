import items.Item;
import items.Weapon;
import items.WeaponType;
import org.junit.Before;
import org.junit.Test;
import players.fighters.Viking;

import static org.junit.Assert.assertEquals;

public class VikingTest {

    Viking viking;
    Item axe;

    @Before
    public void setUp(){
    viking = new Viking(100, 25, 75, "Mads");
    axe = new Weapon(WeaponType.AXE);
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
        assertEquals(1, viking.countInventory());
    }

}
