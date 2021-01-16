package enemies;

public abstract class Enemy {

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

}
