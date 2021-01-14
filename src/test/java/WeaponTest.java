import items.Weapon;
import items.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon weapon;

    @Before
    public void setUp() {
        weapon = new Weapon(WeaponType.AXE);
    }

    @Test
    public void canGetWeaponType() {
        assertEquals(WeaponType.AXE, weapon.getWeapon());
    }

}
