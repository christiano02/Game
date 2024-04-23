public class Monster {

    private String name_monster;
    private double xp_drop;
    private int base_damage;
    private int level_monster;
    private int life_monster;
    private Personagem personagem;

    //construtor
    public Monster(String name_monster){
        this.level_monster = 1;
        this.life_monster = 100;
        this.name_monster = name_monster;
        this.base_damage = 5;
        this.xp_drop = 20;


    }
    //getters e setters
    public String getName_monster() {
        return name_monster;
    }

    public void setName(String name) {
        this.name_monster = name;
    }

    public double getXp_drop() {
        return xp_drop;
    }

    public void setXp_drop(double xp_drop) {
        this.xp_drop = xp_drop;
    }

    public int getBase_damage() {
        return base_damage;
    }

    public void setBase_damage(int base_damage) {
        this.base_damage = base_damage;
    }

    public int getLevel_monster() {
        return level_monster;
    }

    public void setLevel_monster(int level) {
        this.level_monster = level;
    }

    public int getLife_monster() {
        return life_monster;
    }

    public void setLife_monster(double life) {
        this.life_monster = (int) life;
    }

    //metodos
    public void level_up(int level){
        if (level > getLevel_monster())
            setLevel_monster(level);
            setXp_drop(getXp_drop() * 0.5);

    }

}
