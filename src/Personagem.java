public class Personagem {
    private final String name;
    private int life;
    private Sword sword;
    private int level;
    private int xp;
    private double xp_limit;
    private Monster monster;

 
    //construtor
    public Personagem(String name, Sword sword){
        this.name = name;
        this.sword = sword;
        this.level = 1;
        this.xp = 0;
        this.xp_limit = 100;
        this.life = 100;

    }
    //setters e getters
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
    public String getName() {
        return name;
    }
    public Monster getMonster() {
        return monster;
    }
    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    //metodo para subir de nivel do personagem
    public void level_up(){
        setLevel(getLevel() + 1);
        setXp(getXp() - getXp_limit());
        setXp_limit(getXp_limit() * 1.5);
        System.out.println("Level Up!\n Level:" + this.level);
    }

    //metodo de ataque do personagem
    public void attacks(Monster target){
        int xp_monster = 50;
        int damage = sword.getBase_damage();
        target.setLife_monster(target.getLife_monster() - damage);
        System.out.println(getName() + " Atacou " + target.getName_monster() + " causando " + damage + " de dano");
        if (target.getLife_monster() == 0){
            this.xp += xp_monster;
            if (this.getXp()>= this.getXp_limit()) {
                this.level_up();
                target.level_up(getLevel());
            }
            System.out.println("O " + target.getName_monster() + " level " + target.getLevel_monster() + " morreu!");
        }
    }
}

