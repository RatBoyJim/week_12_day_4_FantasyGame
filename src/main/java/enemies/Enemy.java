package enemies;

import behaviours.IAttack;
import players.Player;

public abstract class Enemy implements IAttack {

    private int healthPoints;
    private int attackPoints;
    private String name;

    public Enemy(int healthPoints, int attackPoints, String name) {
        this.healthPoints = healthPoints;
        this.attackPoints = attackPoints;
        this.name = name;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public void setHealthPoints(int newHealthPoints) {
        this.healthPoints = newHealthPoints;
    }

    public int getAttackPoints() {
        return this.attackPoints;
    }

    public String getName() {return this.name;}

    @Override
    public void attack(Player player, Enemy enemy) {
        int enemyAP = enemy.getAttackPoints();
        int playerHP = player.getHealthPoints();
        playerHP -= enemyAP;
        player.setHealthPoints(playerHP);
    }

}
