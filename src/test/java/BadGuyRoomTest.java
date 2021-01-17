import enemies.Enemy;
import enemies.Orc;
import items.*;
import org.junit.Before;
import org.junit.Test;
import players.clerics.Druid;
import players.fighters.Viking;
import players.magicMen.Warlock;
import rooms.BadGuyRoom;
import rooms.TreasureRoom;

import static org.junit.Assert.*;

public class BadGuyRoomTest {

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
    Enemy enemy;
    Enemy enemy2;
    TreasureRoom treasureRoom;
    TreasureRoom treasureRoom2;
    BadGuyRoom badGuyRoom;
    BadGuyRoom badGuyRoom2;

    @Before
    public void setUp(){
        axe = new Weapon(WeaponType.AXE);
        sword = new Weapon(WeaponType.SWORD);
        treasure = new Treasure(TreasureType.PS5);
        treasure2 = new Treasure(TreasureType.DIAMONDS);
        armour = new Armour(ArmourType.SHIELD);
        weapon = new Weapon(WeaponType.CLUB);
        weapon2 = new Weapon(WeaponType.AXE);
        weapon3 = new Weapon(WeaponType.SWORD);
        spell = new Spell(SpellType.NIPPLE_TWEAK);
        creature = new Creature(CreatureType.MANTICORE);
        healingTool = new HealingTool(HealingToolType.SPLIFF);
        enemy = new Orc(50, 25, "Orcy McOrcface", weapon, armour);
        enemy = new Orc(50, 25, "Orcy McOrcington", weapon, armour);
        treasureRoom = new TreasureRoom("Room of Fortune", false, treasure);
        treasureRoom2 = new TreasureRoom("Room of Good Boon", false, treasure2);
        viking = new Viking(100, 25, 75, "Mads", weapon, armour);
        warlock = new Warlock(50, 25, 0, "Magic Mike", spell, creature);
        druid = new Druid(150, 25, 25, "Getafix", healingTool);
        badGuyRoom = new BadGuyRoom("Room of Doom", false, enemy);
        badGuyRoom2 = new BadGuyRoom("Room of Ruin", false, enemy2);
    }


}