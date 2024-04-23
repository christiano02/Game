public class Personagem {
    private final String name;
    private int life;
    private Sword sword;
    private int level;
    private double xp;
    private double xp_limit;
    private Monster monster;
    private boolean status_life;

 
    //construtor
    public Personagem(String name, Sword sword){
        this.name = name;
        this.sword = sword;
        this.level = 1;
        this.xp = 0;
        this.xp_limit = 100;
        this.life = 100;
        this.status_life = true;

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
        return (int) life;
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
    public boolean isStatus_life() {
        return status_life;
    }
    public void setStatus_life(boolean status_life) {
        this.status_life = status_life;
    }

    //metodo para subir de nivel do personagem
    public void level_up(){
        setLevel(getLevel() + 1);
        setXp(getXp() - getXp_limit());
        setXp_limit(getXp_limit() * 1.5);
        setLife((int) (getLife() * 0.2));
        System.out.println("Level Up!\nLevel:" + this.level);
    }

    //metodo de ataque do personagem
    public void attacks(Monster target){
        double xp_monster = target.getXp_drop();
        int damage = sword.getBase_damage();
        target.setLife_monster(target.getLife_monster() - damage);
        System.out.println(this.getName() + " Atacou " + target.getName_monster() + " causando " + damage + " de dano");
        if (target.getLife_monster() == 0){
            this.xp += xp_monster;
            System.out.println("O " + target.getName_monster() + " level " + target.getLevel_monster() + " morreu!");
            System.out.println("XP drop: " + target.getXp_drop());
            if (this.getXp()>= this.getXp_limit()) {
                this.level_up();
                target.level_up(getLevel());
            }

        }
        else {
            //ataque do monstro
            this.setLife(getLife() - target.getBase_damage());
            System.out.println(target.getName_monster() + " Atacou " + this.getName() + " causando " + target.getBase_damage() + " de dano");
            System.out.println("Vida do " + this.getName() + " : " + this.getLife());
            if (this.getLife() == 0){
                System.out.println("Você morreu!");
                this.setStatus_life(false);

            }
        }
    }
}

