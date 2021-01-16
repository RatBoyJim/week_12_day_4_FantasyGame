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

    @Override
    public void attackByFighter(Fighter fighter, Enemy enemy) {
        int enemyHP = enemy.getHealthPoints();
        int fighterAP = fighter.getAttackPoints();
        enemyHP -= fighterAP;
        enemy.setHealthPoints(enemyHP);


    }
}
//    attackByFirstPokemon(){
//        if (this.pokemonDetails2.stats[0].base_stat < this.pokemonMoves1.pp) {
//            eventBus.$emit('set-health-p2', this.pokemonDetails2.stats[0].base_stat)
//            eventBus.$emit('pokemon-defeated-2', this.pokemonDetails2.isDefeated = true)
//        const payload = {'pokemonDetails1':this.pokemonDetails1, 'pokemonDetails2':this.pokemonDetails2}
//            eventBus.$emit('pokemon-1-win', payload);
//        }else{
//            eventBus.$emit('set-health-p2', this.pokemonMoves1.pp)
//            eventBus.$emit('p1played', this.p1turn = false)
//            eventBus.$emit('p2next', this.p2turn = true)
//        }},