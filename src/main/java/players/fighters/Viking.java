package players.fighters;

import items.Armour;
import items.Weapon;

import java.util.ArrayList;

public class Viking extends Fighter {

    private ArrayList<String> weaponsList;

    public Viking(int healthPoints, int defencePoints, int attackPoints, String name, Weapon weapon, Armour armour) {
        super(healthPoints, defencePoints, attackPoints, name, weapon, armour);
        weaponsList = new ArrayList<String>();

    }

    public void changeWeapon(){
    }
}
