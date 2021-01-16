import enemies.Enemy;
import enemies.Orc;
import items.*;
import org.junit.Before;
import org.junit.Test;
import players.fighters.Viking;
import rooms.BadGuyRoom;
import rooms.TreasureRoom;

import static org.junit.Assert.*;

public class VikingTest {

    Viking viking;
    Item axe;
    Item sword;
    Weapon weapon;
    Weapon weapon2;
    Weapon weapon3;
    Armour armour;
    Treasure treasure;
    Enemy enemy;
    TreasureRoom treasureRoom;
    BadGuyRoom badGuyRoom;

    @Before
    public void setUp(){
        axe = new Weapon(WeaponType.AXE);
        sword = new Weapon(WeaponType.SWORD);
        treasure = new Treasure(TreasureType.PS5);
        armour = new Armour(ArmourType.SHIELD);
        weapon = new Weapon(WeaponType.CLUB);
        weapon2 = new Weapon(WeaponType.AXE);
        weapon3 = new Weapon(WeaponType.SWORD);
        enemy = new Orc(50, 25, "Orcy McOrcface", weapon, armour);
        treasureRoom = new TreasureRoom("Room of Good Fortune", false, treasure);
        badGuyRoom = new BadGuyRoom("Room of Doom", false, enemy);
        viking = new Viking(100, 25, 75, "Mads", weapon, armour);
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

    @Test
    public void canRemoveFromInventory() {
        viking.addItemToInventory(axe);
        viking.addItemToInventory(treasure);
        viking.addItemToInventory(armour);
        viking.removeItemFromInventory(axe);
        assertEquals(2, viking.countInventory());
    }

//    @Test
//    public void canSwapItemInInventory() {
//        assertEquals("CLUB", viking.getCurrentWeaponName());
//        assertEquals(0, viking.countInventory());
//        viking.addItemToInventory(axe);
//        assertEquals(1, viking.countInventory());
//        viking.swapWeaponFromInventory(axe);
//        viking.addItemToInventory(sword);
//        viking.swapWeaponFromInventory(sword);
//        viking.createWeaponsList();
//        assertEquals("SWORD", viking.getCurrentWeaponName());
//        assertEquals("CLUB, AXE", viking.getNamesOfWeaponsInWeaponsList());
//    }


    @Test
    public void canCreateWeaponsList() {
        viking.addItemToInventory(axe);
        viking.addItemToInventory(sword);
        viking.addItemToInventory(treasure);
        viking.addItemToInventory(armour);
        viking.createWeaponsList();
        assertEquals(2, viking.getSizeOfWeaponsList());
    }

    @Test
    public void startsWithWeapon() {
        assertEquals("CLUB", viking.getCurrentWeaponName());
    }

    @Test
    public void canChangeWeapon() {
        viking.setWeapon(weapon2);
        assertEquals("AXE", viking.getCurrentWeaponName());
    }

    @Test
    public void canAttack() {
        viking.attack(viking, enemy);
        assertEquals(-30, enemy.getHealthPoints());
    }

    @Test
    public void canCompleteTreasureRoom() {
        viking.addItemToInventory(treasureRoom.getTreasure());
        treasureRoom.treasureCollected();
        assertEquals(1, viking.countInventory());
        assertEquals(true, treasureRoom.isCompleted());
    }

    @Test
    public void canCompleteBadGuyRoom() {
        viking.attack(viking, badGuyRoom.getEnemy());
        badGuyRoom.checkIfCompleted();
        assertEquals(true, badGuyRoom.isCompleted());

    }
}
