//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Sword sword = new Sword(100, "Facão");
        Personagem hero = new Personagem("Heroi", sword);
        Sword foice = new Sword(15, "Foice");
        Monster monstro1 = new Monster("Vilão");
        Sword machados_duplos = new Sword(50,"Machados duplos");
        Monster monstro2 = new Monster("Esqueleto");

        do {
            hero.attacks(monstro1);
            hero.attacks(monstro2);

            System.out.println("Vida do " + monstro1.getName() + " " + monstro1.getLife_monster());
            System.out.println(hero.getLife());


            System.out.println("Vida do " + monstro2.getName() + " " +  monstro2.getLife_monster());
            System.out.println(hero.getLife());

        } while (monstro1.getLife_monster() != 0);





    }
}