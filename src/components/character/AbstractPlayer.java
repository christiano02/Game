package components.character;

import components.logic.battleSystem.itens.Item;
import components.weapons.Sword;

import java.util.ArrayList;

public abstract class AbstractPlayer {
    private final String name;
    private int life = 100;
    private Sword sword;
    private int level;
    private int monsterKill;
    private double xp;
    private boolean deathMonster;
    private double experienceLimit;
    private ArrayList<Item> inventory;
 
    //construtor
    public AbstractPlayer(String name, Sword sword){
        this.name = name;
        this.sword = sword;
        this.level = 1;
        this.xp = 0;
        this.monsterKill = 0;
        this.experienceLimit = 100;

    }


    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventorye(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    //setters e gatters
    public Sword getSword() {
        return sword;
    }
    public void setSword(Sword sword) {
        this.sword = sword;
    }
    public double getXp() {
        return xp;
    }
    public void setXp(double xp) {
        this.xp = (int) xp;
    }
    public double getXp_limit() {
        return experienceLimit;
    }

    public void setXp_limit(double xp_limit) {
        this.experienceLimit = xp_limit;
    }
    public boolean isDeath_moster() {
        return deathMonster;
    }
    public void setDeath_moster(boolean deathMoster) {
        this.deathMonster = deathMoster;
    }

    public boolean isDeathMonster() {
        return deathMonster;
    }

    public void setDeathMonster(boolean deathMonster) {
        this.deathMonster = deathMonster;
    }

    public double getExperienceLimit() {
        return experienceLimit;
    }

    public void setExperienceLimit(double experienceLimit) {
        this.experienceLimit = experienceLimit;
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

}

