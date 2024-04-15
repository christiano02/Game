public class Personagem {
    private final String name;
    private int life = 100;
    private Sword sword;
    private int level;
    private int monster_kil;
    private int xp;
    private boolean death_moster;
    private int xp_limit;
 
    //construtor
    public Personagem(String name, Sword sword){
        this.name = name;
        this.sword = sword;
        this.level = 1;
        this.xp = 0;
        this.monster_kil = 0;
        this.xp_limit = 100;

    }

    

    //setters e gatters
    public Sword getSword() {
        return sword;
    }
    public void setSword(Sword sword) {
        this.sword = sword;
    }
    public int getXp() {
        return xp;
    }
    public void setXp(int xp) {
        this.xp = xp;
    }
    public int getXp_limit() {
        return xp_limit;
    }

    public void setXp_limit(int xp_limit) {
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
        this.level += 1;
        this.xp -= xp_limit;
        this.xp_limit *= 1.5;
        System.out.println("Level Up!\n Level:" + this.level);
        }
    //metodo de ataque do personagem ao outro
    public void ataca(Personagem target){
        int xp_monster = 50;
        int damage = sword.getBase_damage();
        target.life -= damage;
        System.out.println(name + " Atacou " + target.name + " causando " + damage + " de dano");
            if (target.life == 0){
                this.xp += xp_monster;
                if (this.getXp()>= this.getXp_limit()) {
                    this.level_up();
                    
                } 
                target.setMonster_kil(target.getMonster_kil() + 1);
                System.out.println("O " + target.getName() + "level" + target.getLevel() + " morreu!");
        }

    }
}

