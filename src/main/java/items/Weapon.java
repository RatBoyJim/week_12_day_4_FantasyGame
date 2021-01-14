package items;

public class Weapon {
    private WeaponType weapon;

    public Weapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public WeaponType getWeapon(){
            return this.weapon;
    }
}
