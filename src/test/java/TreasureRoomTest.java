import items.Treasure;
import items.TreasureType;
import org.junit.Before;
import org.junit.Test;

import rooms.TreasureRoom;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    TreasureRoom treasureRoom;
    Treasure treasure;

    @Before
    public void setUp() {
        treasure = new Treasure(TreasureType.PS5);
        treasureRoom =  new TreasureRoom("Room of Obscene Wealth", false, treasure);
    }

    @Test
    public void hasTreasure() {
        assertEquals("PS5", treasureRoom.getCurrentTreasureName());
    }

    @Test
    public void startsIncomplete() {
        assertEquals(false, treasureRoom.isCompleted());
    }

    @Test
    public void canBeCompleted() {
        treasureRoom.setAsCompleted();
        assertEquals(true, treasureRoom.isCompleted());
    }
}
