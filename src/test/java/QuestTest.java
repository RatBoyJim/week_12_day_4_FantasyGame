import enemies.Enemy;
import enemies.Orc;
import enemies.Troll;
import items.*;
import org.junit.Before;
import org.junit.Test;
import players.clerics.Druid;
import players.fighters.Viking;
import players.magicMen.Warlock;
import rooms.BadGuyRoom;
import rooms.TreasureRoom;

import static org.junit.Assert.*;

public class QuestTest {

    Quest quest;
    Viking viking;
    Warlock warlock;
    Druid druid;
    Item axe;
    Item sword;
    Weapon weapon;
    Weapon weapon2;
    Weapon weapon3;
    Spell spell;
    Creature creature;
    HealingTool healingTool;
    Armour armour;
    Treasure treasure;
    Treasure treasure2;
    Treasure treasure3;
    Enemy enemy;
    Enemy enemy2;
    Enemy enemy3;
    TreasureRoom treasureRoom;
    TreasureRoom treasureRoom2;
    TreasureRoom treasureRoom3;
    BadGuyRoom badGuyRoom;
    BadGuyRoom badGuyRoom2;
    BadGuyRoom badGuyRoom3;


    @Before
    public void setUp(){
        axe = new Weapon(WeaponType.AXE);
        sword = new Weapon(WeaponType.SWORD);
        treasure = new Treasure(TreasureType.PS5);
        treasure2 = new Treasure(TreasureType.DIAMONDS);
        treasure3 = new Treasure(TreasureType.GOLD);
        armour = new Armour(ArmourType.SHIELD);
        weapon = new Weapon(WeaponType.CLUB);
        weapon2 = new Weapon(WeaponType.AXE);
        weapon3 = new Weapon(WeaponType.SWORD);
        spell = new Spell(SpellType.NIPPLE_TWEAK);
        creature = new Creature(CreatureType.MANTICORE);
        healingTool = new HealingTool(HealingToolType.SPLIFF);
        enemy = new Orc(50, 45, "Orcy McOrcface", weapon, armour);
        enemy2 = new Orc(50, 45, "Orcy McOrcington", weapon, armour);
        enemy3 = new Troll(25, 60, "BawFace", weapon, armour);
        treasureRoom = new TreasureRoom("Room of Fortune", false, treasure);
        treasureRoom2 = new TreasureRoom("Room of Good Boon", false, treasure2);
        treasureRoom3 = new TreasureRoom("Room That Has Gold In It", false, treasure3);
        viking = new Viking (100, 25, 75, "Mads", weapon, armour);
        warlock = new Warlock(50, 25, 0, "Magic Mike", spell, creature);
        druid = new Druid(175, 25, 25, "Getafix", healingTool);
        badGuyRoom = new BadGuyRoom("Room of Doom", false, enemy);
        badGuyRoom2 = new BadGuyRoom("Room of Ruin", false, enemy2);
        badGuyRoom3 = new BadGuyRoom("Room of Yer Goin' Doon", false, enemy3);
        quest = new Quest(false);
    }

    @Test
    public void canFacilitateBattle() {
        quest.battle(viking, badGuyRoom);
        assertTrue(badGuyRoom.checkIfCompleted());
    }

    @Test
    public void canPopulateRoomList () {
        quest.addRoomToRoomList(treasureRoom);
        quest.addRoomToRoomList(badGuyRoom);
        quest.addRoomToRoomList(badGuyRoom2);
        quest.addRoomToRoomList(treasureRoom2);
        assertEquals(4, quest.getRoomListSize());
    }

    @Test
    public void canFacilitateQuest() {
        quest.addRoomToRoomList(treasureRoom);
        quest.addRoomToRoomList(badGuyRoom);
        quest.addRoomToRoomList(treasureRoom3);
        quest.addRoomToRoomList(badGuyRoom3);
        quest.addRoomToRoomList(treasureRoom2);
        quest.addRoomToRoomList(badGuyRoom2);
        System.out.println("Viking " + viking.getName() + " starts with " + viking.getNamesOfItemsInInventory() + " in their inventory");
        System.out.println("Viking "  + viking.getName() + " starts with " + viking.getHealthPoints() + " Health Points");
        viking.updateDefencePointsWithEquippedArmour();
        viking.updateAttackPointsWithEquippedWeapon();
        quest.quest(viking);
        System.out.println("Viking "  + viking.getName() + " ends with " + viking.getNamesOfItemsInInventory() + " in their inventory");
        System.out.println("Viking "  + viking.getName() + " ends with " + viking.getHealthPoints() + " Health Points");
        System.out.println(" ");
        assertTrue(quest.checkIfQuestCompleted());
    }

    @Test
    public void canFacilitateAnotherQuest() {
        quest.addRoomToRoomList(treasureRoom);
        quest.addRoomToRoomList(badGuyRoom);
        quest.addRoomToRoomList(treasureRoom2);
        System.out.println("Warlock " + warlock.getName() + " starts with " + warlock.getNamesOfItemsInInventory() + " in their inventory");
        System.out.println("Warlock "  + warlock.getName() + " starts with " + warlock.getHealthPoints() + " Health Points");
        System.out.println("Warlock "  + warlock.getName() + " starts with " + warlock.getDefencePoints() + " Defence Points");
        warlock.updateAttackPointsWithEquippedSpell();
        warlock.updateDefencePointsWithEquippedCreature();
        quest.quest(warlock);
        System.out.println("Warlock "  + warlock.getName() + " ends with " + warlock.getNamesOfItemsInInventory() + " in their inventory");
        System.out.println("Warlock "  + warlock.getName() + " ends with " + warlock.getHealthPoints() + " Health Points");
        System.out.println("Warlock "  + warlock.getName() + " ends with " + warlock.getDefencePoints() + " Defence Points");
        System.out.println(" ");
        assertTrue(quest.checkIfQuestCompleted());
    }

    @Test
    public void canFacilitateYetAnotherQuest() {
        quest.addRoomToRoomList(treasureRoom3);
        quest.addRoomToRoomList(badGuyRoom);
        quest.addRoomToRoomList(badGuyRoom2);
        quest.addRoomToRoomList(treasureRoom2);
        System.out.println("Druid " + druid.getName() + " starts with " + druid.getNamesOfItemsInInventory() + " in their inventory");
        System.out.println("Druid "  + druid.getName() + " starts with " + druid.getHealthPoints() + " Health Points");
        quest.quest(druid);
        System.out.println("Druid "  + druid.getName() + " ends with " + druid.getNamesOfItemsInInventory() + " in their inventory");
        System.out.println("Druid "  + druid.getName() + " ends with " + druid.getHealthPoints() + " Health Points");
        System.out.println(" ");
        assertTrue(quest.checkIfQuestCompleted());
    }


}
