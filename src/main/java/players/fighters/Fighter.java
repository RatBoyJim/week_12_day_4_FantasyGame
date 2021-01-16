package players.fighters;

import behaviours.IAttack;
import items.*;
import players.Player;
import enemies.Enemy;

import java.util.ArrayList;


public class Fighter extends Player implements IAttack {

    private Weapon weapon;
    private Armour armour;
    private ArrayList<Item> weaponsList;
    private ArrayList<String> weaponsListNames;


    public Fighter(int healthPoints, int defencePoints, int attackPoints, String name, Weapon weapon, Armour armour) {
        super(healthPoints, defencePoints, attackPoints, name);
        this.weapon = weapon;
        this.armour = armour;
        weaponsList = new ArrayList<Item>();
        weaponsListNames = new ArrayList<String>();
    }

    public void createWeaponsList() {
        for (Item item: this.getInventory()) {
            if (item instanceof Weapon){
                weaponsList.add(item);
            }
        }
    }

    public int getSizeOfWeaponsList() {
        return this.weaponsList.size();
    }

    public String getCurrentWeaponName() {
        return this.weapon.getWeaponName();
    };

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<String> getNamesOfWeaponsInWeaponsList() {
        for (Item weapon: weaponsList) {
            weaponsListNames.add(((Weapon) weapon).getWeaponName());
        }
        return this.weaponsListNames;
    }

    public void swapWeaponFromInventory(Item itemWanted) {
        addItemToInventory(this.weapon);
        removeItemFromInventory(itemWanted);
        setWeapon((Weapon)itemWanted);

    }

    public void updateAttackPointsWithEquippedWeapon() {
        WeaponType weaponType = this.weapon.getWeapon();
        int weaponAttackPoints = weaponType.getAttackDamage();
        int playerBaseAttackPoints = getAttackPoints();
        int newTotalAttackPoints = weaponAttackPoints + playerBaseAttackPoints;
        setAttackPoints(newTotalAttackPoints);
    }

    @Override
    public void attack(Player player, Enemy enemy) {
        int enemyHP = enemy.getHealthPoints();
        updateAttackPointsWithEquippedWeapon();
        int fighterAP = player.getAttackPoints();
        enemyHP -= fighterAP;
        enemy.setHealthPoints(enemyHP);
    }
}
