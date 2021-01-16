import items.Treasure;
import items.TreasureType;
import org.junit.Before;
import org.junit.Test;

import rooms.TreasureRoom;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    TreasureRoom treasureRoom;
    Treasure treasure;
    Treasure treasure2;

    @Before
    public void setUp() {
        treasure = new Treasure(TreasureType.PS5);
        treasure2 = new Treasure(TreasureType.GOLD);
        treasureRoom =  new TreasureRoom("Room of Obscene Wealth", false, treasure);
    }

    @Test
    public void hasTreasure() {
        assertEquals("PS5", treasureRoom.getCurrentTreasureName());
    }

    @Test
    public void canSetTreasure() {
        assertEquals("PS5", treasureRoom.getCurrentTreasureName());
        treasureRoom.setTreasure(treasure2);
        assertEquals("GOLD", treasureRoom.getCurrentTreasureName());
    }

    @Test
    public void startsIncomplete() {
        assertEquals(false, treasureRoom.isCompleted());
    }

    @Test
    public void canBeCompleted() {
        treasureRoom.treasureCollected();
        assertEquals(true, treasureRoom.isCompleted());
    }

}
