package components.logic.battleSystem;

import components.character.Player;
import components.characterEnemy.Enemy;

public class BattleSystem {

    //Metodo estatico status
    public static void StatusPlayerAndEnenmy(Player player, Enemy enemy){
        System.out.println("\n-----STATUS PLAYER AND ENEMY-----");
        System.out.println("NAME PLAYER: " + player.getName() + " Life " + player.getWeapon());
        System.out.println("NAME ENEMY: " + enemy.getName() + " Life " + enemy.getLife());
    }

    //Metodo estatico de ataque do player
    public static boolean playerAttack(Player player, Enemy enemy){
        enemy.setLife(enemy.getLife() - player.getWeapon().getBaseDamage());
        return enemy.getLife() <=0;
    }
    //metodo estatico de ataque do inimigo
    public static boolean enemyAttack(Enemy enemy, Player player){
        player.setLife(player.getLife() - enemy.getBaseDamage());
        return player.getLife() <= 0;
    }
    //metodo para usar item
    public static void useItemImBattle(Player player, int index){

    }
}
