package components.weapons;

public class Weapon {
    private int baseDamage;
    private String weaponName;
    private int weaponLevel;

    public Weapon() {
    }

    public Weapon(int baseDamage, int weaponLevel, String weaponName) {
        this.baseDamage = baseDamage;
        this.weaponLevel = weaponLevel;
        this.weaponName = weaponName;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getWeaponLevel() {
        return weaponLevel;
    }

    public void setWeaponLevel(int weaponLevel) {
        this.weaponLevel = weaponLevel;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
    //metodo de nivel da arma
    public void levelUpWeapon(){

    }
}
