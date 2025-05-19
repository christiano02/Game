package components.character;

import components.logic.battleSystem.itens.Item;
import components.weapons.Weapon;

import java.util.ArrayList;

public abstract class AbstractPlayer {
    private String name;
    private int life = 100;
    private int level;
    private int monsterKill;
    private double experience;
    private boolean deathMonster;
    private ArrayList<Item> inventory;
    private Weapon weapon;
 
    //construtores
    public AbstractPlayer() {}

    public AbstractPlayer(String name, boolean deathMonster, double experience, ArrayList<Item> inventory,
                          int level, int life, int monsterKill, Weapon weapon) {
        this.name = name;
        this.deathMonster = deathMonster;
        this.experience = experience;
        this.inventory = inventory;
        this.level = level;
        this.life = life;
        this.monsterKill = monsterKill;
        this.weapon = weapon;
    }


    //setters e gatters
    public boolean isDeathMonster() {
        return deathMonster;
    }
    public void setDeathMonster(boolean deathMonster) {
        this.deathMonster = deathMonster;
    }
    public double getExperience() {
        return experience;
    }
    public void setExperience(double experience) {
        this.experience = experience;
    }
    public ArrayList<Item> getInventory() {
        return inventory;
    }
    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getLife() {
        return life;
    }
    public void setLife(int life) {
        this.life = life;
    }
    public int getMonsterKill() {
        return monsterKill;
    }
    public void setMonsterKill(int monsterKill) {
        this.monsterKill = monsterKill;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}

