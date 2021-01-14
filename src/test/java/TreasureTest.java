import items.Treasure;
import items.TreasureType;
import items.Weapon;
import items.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureTest {

    Treasure treasure;

    @Before
    public void setUp() {
        treasure = new Treasure(TreasureType.PS5);
    }

    @Test
    public void canGetTreasureType() {
        assertEquals(TreasureType.PS5, treasure.getTreasure());
    }
}
