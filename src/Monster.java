public class Monster {

    private String name_monster;
    private double xp_drop;
    private int base_damage;
    private int level;
    private Personagem personagem;
    private int life_monster;

    //construtor
    public Monster(String name_monster){
        this.level = 1;
        this.life_monster = 100;
        this.name_monster = name_monster;

    }
    //getters e setters
    public String getName() {
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLife_monster() {
        return life_monster;
    }

    public void setLife_monster(int life) {
        this.life_monster = life;
    }

    //metodos
    public void level_up(){
        if (personagem.getLevel() > getLevel())
            setLevel(personagem.getLevel());

    }
}
