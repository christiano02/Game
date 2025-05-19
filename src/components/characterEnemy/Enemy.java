package components.characterEnemy;

public class Enemy {

    private String name;
    private int baseDamage;
    private int life;

    public Enemy() {
    }

    public Enemy(int baseDamage, int life, String name) {
        this.baseDamage = baseDamage;
        this.life = life;
        this.name = name;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
