package components.weapons;

public abstract class Weapons {
    private int baseDamage;
    private String swordName;
    private int level;

    public Weapons() {
    }

    public Weapons(int baseDamage, int level, String swordName) {
        this.baseDamage = baseDamage;
        this.level = level;
        this.swordName = swordName;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getSwordName() {
        return swordName;
    }

    public void setSwordName(String swordName) {
        this.swordName = swordName;
    }
    //metodo de nivel da arma
    public void upLevelArm(){

    }
}
