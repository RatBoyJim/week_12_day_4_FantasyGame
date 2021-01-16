package behaviours;

import enemies.Enemy;
import players.fighters.Fighter;

public interface IAttack {

    void attackByFighter(Fighter fighter, Enemy enemy);

//    void attackByEnemy(Player player);
}
