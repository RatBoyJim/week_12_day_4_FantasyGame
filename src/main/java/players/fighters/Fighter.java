package players.fighters;

import items.*;
import players.Player;
import enemies.Enemy;
import rooms.BadGuyRoom;
import rooms.Room;
import rooms.TreasureRoom;

import java.util.ArrayList;


public class Fighter extends Player {

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
        return this.weapon.getItemName();
    };

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<String> getNamesOfWeaponsInWeaponsList() {
        for (Item weapon: weaponsList) {
            weaponsListNames.add(((Weapon) weapon).getItemName());
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

    public void playRooms(Fighter fighter, Room room1, Room room2) {
        if (room1 instanceof TreasureRoom){
            addItemToInventory(((TreasureRoom) room1).getTreasure());
        }
        if (room1 instanceof BadGuyRoom){
            fighter.attack(fighter, ((BadGuyRoom) room1).getEnemy());
        }
        if (room2 instanceof TreasureRoom){
            addItemToInventory(((TreasureRoom) room2).getTreasure());
        }
        if (room2 instanceof BadGuyRoom){
            fighter.attack(fighter, ((BadGuyRoom) room2)
                    .getEnemy());
        }
    }
}
