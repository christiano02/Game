package components.character;

import components.logic.battleSystem.itens.Item;
import components.weapons.Sword;

import java.util.ArrayList;

public abstract class AbstractPlayer {
    private final String name;
    private int life = 100;
    private Sword sword;
    private int level;
    private int monster_kil;
    private double xp;
    private boolean death_moster;
    private double xp_limit;
    private ArrayList<Item> inventario;
 
    //construtor
    public AbstractPlayer(String name, Sword sword){
        this.name = name;
        this.sword = sword;
        this.level = 1;
        this.xp = 0;
        this.monster_kil = 0;
        this.xp_limit = 100;

    }


    public ArrayList<Item> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Item> inventario) {
        this.inventario = inventario;
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
        return xp_limit;
    }

    public void setXp_limit(double xp_limit) {
        this.xp_limit = xp_limit;
    }
    public boolean isDeath_moster() {
        return death_moster;
    }
    public void setDeath_moster(boolean death_moster) {
        this.death_moster = death_moster;
    }

    public Sword getEspada() {
        return sword;
    }

    public void setEspada(Sword sword) {
        this.sword = sword;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMonster_kil() {
        return monster_kil;
    }

    public void setMonster_kil(int monster_kil) {
        this.monster_kil = monster_kil;
    }

    public String getName() {
        return name;
    }

    public void level_up(){
        setLevel(getLevel() + 1);
        setXp(getXp() - getXp_limit());
        setXp_limit(getXp_limit() * 1.5);
        System.out.println("Level Up!\n Level:" + this.level);
        }
    //metodo de ataque do personagem ao outro
    public void ataca(AbstractPlayer target){
        int xp_monster = 50;
        int damage = sword.getBase_damage();
        target.life -= damage;
        System.out.println(getName() + " Atacou " + target.getName() + " causando " + damage + " de dano");
            if (target.getLife() == 0){
                this.xp += xp_monster;
                if (this.getXp()>= this.getXp_limit()) {
                    this.level_up();
                    
                } 
                target.setMonster_kil(target.getMonster_kil() + 1);
                System.out.println("O " + target.getName() + "level" + target.getLevel() + " morreu!");
        }

    }
}

