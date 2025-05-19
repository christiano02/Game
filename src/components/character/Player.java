package components.character;

import components.logic.battleSystem.itens.Item;
import components.weapons.Weapon;

import java.util.ArrayList;

public class Player extends AbstractPlayer {

    public Player(String name, boolean deathMonster, double experience, ArrayList<Item> inventory, int level, int life, int monsterKill, Weapon weapon) {
        super(name, deathMonster, experience, inventory, level, life, monsterKill, weapon);
    }

    //metodo usar item
    public void useItem(int index){
        if (index >= 0 && index < getInventory().size()){
            Item item = getInventory().remove(index);
        }
    }
}
