package components.character;

import components.logic.battleSystem.itens.Item;
import components.weapons.Sword;

import java.util.ArrayList;

public class PlayerWarrior extends AbstractPlayer {

    Sword sword;

    public PlayerWarrior(String name, boolean deathMonster, double experience, ArrayList<Item> inventory, int level, int life, int monsterKill, Sword sword) {
        super(name, deathMonster, experience, inventory, level, life, monsterKill);
        this.sword = sword;
    }

    public PlayerWarrior(Sword sword) {
        this.sword = sword;
    }

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }
}
