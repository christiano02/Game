public class Sword {
    private int base_damage;
    private String sword_name;
    private int level;
    public Sword(int base_damage, String sword_name){
        this.base_damage = base_damage;
        this.sword_name = sword_name;
    }

    public int getBase_damage() {
        return base_damage;
    }

    public void setBase_damage(int base_damage) {
        this.base_damage = base_damage;
    }

    public String getSword_name() {
        return sword_name;
    }

    public void setSword_name(String sword_name) {
        this.sword_name = sword_name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public void level_up(){
        this.setBase_damage(this.getBase_damage());

    }

}
