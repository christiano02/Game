package components.logic.battleSystem;

import components.character.PlayerWarrior;
import components.characterEnemy.Enemy;
import components.weapons.Sword;

public class BattleSystem {

    public void playerAttack(PlayerWarrior playerWarrior, Sword damage, Enemy enemy){
       enemy.setLifeEnemy(enemy.getLifeEnemy() - playerWarrior.getSword().getBaseDamage());
    }
}
