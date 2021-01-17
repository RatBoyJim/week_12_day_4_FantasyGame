import enemies.Orc;
import items.Armour;
import items.ArmourType;
import items.Weapon;
import items.WeaponType;
import org.junit.Before;
import org.junit.Test;
import players.fighters.Viking;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;
    Weapon weapon;
    Armour armour;
    Viking viking;

    @Before
    public void setUp() {
        weapon = new Weapon(WeaponType.AXE);
        armour = new Armour(ArmourType.HELMET);
        orc = new Orc(50, 40, "Orcy McOrcFace", weapon, armour);
        viking = new Viking(100, 25, 75, "Mads", weapon, armour);
    }

    @Test
    public void canAttack() {
        orc.attack(viking, orc);
        assertEquals(85, viking.getHealthPoints());
    }
}
