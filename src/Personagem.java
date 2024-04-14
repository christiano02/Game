public class Personagem {
    private final String name;
    private int life = 100;
    private Sword sword;
    private int level;
    private int monster_kil;
    public Personagem(String name, Sword sword){
        this.name = name;
        this.sword = sword;
        this.level = 1;
        this.monster_kil = 0;

    }
    public void ataca(Personagem target){
        int dano = sword.getBase_damage();
        target.life -= dano;
        System.out.println(name + " Atacou " + target.name + " causando " + dano + " de dano");
        if (target.life == 0){
            target.setMonster_kil(target.getMonster_kil() + 1);
            System.out.println("O " + target.name + "level" + target.level + " morreu!");

        }

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
        }


}
