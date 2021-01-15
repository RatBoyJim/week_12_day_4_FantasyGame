import items.*;
import org.junit.Before;
import org.junit.Test;
import players.magicMen.Wizard;

import static org.junit.Assert.assertEquals;

public class WizardTest {
    
    Wizard wizard;
    Item fireball;
    Item stun;
    Item nippleTwist;
    Item dragon;
    Item manticore;
    Spell spell;
    Spell spell2;
    Spell spell3;
    Creature creature;
    Creature creature2;
    Treasure treasure;
    
    @Before
    public void setUp() {
        fireball = new Spell(SpellType.FIREBALL);
        stun = new Spell(SpellType.STUN);
        nippleTwist = new Spell(SpellType.NIPPLE_TWEAK);
        treasure = new Treasure(TreasureType.PS5);
        spell = new Spell(SpellType.STUN);
        spell2 = new Spell(SpellType.ICE_RAGE);
        spell3 = new Spell(SpellType.NIPPLE_TWEAK);
        creature = new Creature(CreatureType.DRAGON);
        creature2 = new Creature(CreatureType.MANTICORE);
        dragon = new Creature(CreatureType.DRAGON);
        manticore = new Creature(CreatureType.MANTICORE);
        wizard = new Wizard(60, 15, 0, "Sooty", spell, creature);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(60, wizard.getHealthPoints());
    }

    @Test
    public void hasDefencePoints() {
        assertEquals(15, wizard.getDefencePoints());
    }

    @Test
    public void hasAttackPoints() {
        assertEquals(0, wizard.getAttackPoints());
    }

    @Test
    public void hasName() {
        assertEquals("Sooty", wizard.getName());
    }

    @Test
    public void canAddToInventory() {
        wizard.addItemToInventory(fireball);
        wizard.addItemToInventory(treasure);
        wizard.addItemToInventory(stun);
        assertEquals(3, wizard.countInventory());
    }

    @Test
    public void canRemoveFromInventory() {
        wizard.addItemToInventory(fireball);
        wizard.addItemToInventory(treasure);
        wizard.addItemToInventory(stun);
        wizard.removeItemFromInventory(stun);
        assertEquals(2, wizard.countInventory());
    }

//    @Test
//    public void canSwapItemInInventory() {
//        assertEquals("STUN", wizard.getCurrentSpellName());
//        assertEquals(0, wizard.countInventory());
//        wizard.addItemToInventory(fireball);
//        assertEquals(1, wizard.countInventory());
//        wizard.swapSpellFromInventory(fireball);
//        wizard.addItemToInventory(nippleTwist);
//        wizard.swapSpellFromInventory(nippleTwist);
//        wizard.createSpellsList();
//        assertEquals("NIPPLE_TWEAK", wizard.getCurrentSpellName());
//        assertEquals("STUN, FIREBALL", wizard.getNamesOfSpellsInSpellsList());
//    }


    @Test
    public void canCreateWeaponsList() {
        wizard.addItemToInventory(fireball);
        wizard.addItemToInventory(stun);
        wizard.addItemToInventory(treasure);
        wizard.createSpellsList();
        assertEquals(2, wizard.getSizeOfSpellsList());
    }

    @Test
    public void canCreateCreatureList() {
        wizard.addItemToInventory(dragon);
        wizard.addItemToInventory(manticore);
        wizard.addItemToInventory(treasure);
        wizard.createCreatureList();
        assertEquals(2, wizard.getSizeOfCreatureList());
    }

    @Test
    public void startsWithSpell() {
        assertEquals("STUN", wizard.getCurrentSpellName());
    }

    @Test
    public void startsWithCreature() {
        assertEquals("DRAGON", wizard.getCurrentCreatureName());
    }

    @Test
    public void canChangeWeapon() {
        wizard.setSpell(spell2);
        assertEquals("ICE_RAGE", wizard.getCurrentSpellName());
    }

    @Test
    public void canChangeCreature() {
        wizard.setCreature(creature2);
        assertEquals("MANTICORE", wizard.getCurrentCreatureName());
    }
    
}
