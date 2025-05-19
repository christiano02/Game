package components.characterEnemy;

public class Enemy {

    private String nameEnemy;
    private int baseDamage;
    private int lifeEnemy;

    public Enemy() {
    }

    public Enemy(int baseDamage, int lifeEnemy, String nameEnemy) {
        this.baseDamage = baseDamage;
        this.lifeEnemy = lifeEnemy;
        this.nameEnemy = nameEnemy;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getLifeEnemy() {
        return lifeEnemy;
    }

    public void setLifeEnemy(int lifeEnemy) {
        this.lifeEnemy = lifeEnemy;
    }

    public String getNameEnemy() {
        return nameEnemy;
    }

    public void setNameEnemy(String nameEnemy) {
        this.nameEnemy = nameEnemy;
    }
}
