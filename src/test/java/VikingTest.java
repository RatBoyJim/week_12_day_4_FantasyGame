import org.junit.Before;
import org.junit.Test;
import players.fighters.Viking;

import static org.junit.Assert.assertEquals;

public class VikingTest {

    Viking viking;

    @Before
    public void setUp(){
    viking = new Viking(100, 25, 75, "Mads");
    }

    @Test
    public void hasHP(){
        assertEquals(100, viking.getHealthPoints());
    }

}
