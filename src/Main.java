//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Sword sword = new Sword(100, "Facão");
        Personagem heroi = new Personagem("Heroi", sword);
        Sword foice = new Sword(15, "Foice");
        Personagem monstro1 = new Personagem("Vilão", foice);
        Sword machados_duplos = new Sword(50,"Machados duplos");
        Personagem monstro2 = new Personagem("Esqueleto", machados_duplos);

        do {
            heroi.ataca(monstro1);
            heroi.ataca(monstro2);

            System.out.println("Vida do " + monstro1.getName() + " " + monstro1.getLife());
            System.out.println(monstro1.getMonster_kil());
            System.out.println(heroi.getLife());


            System.out.println("Vida do " + monstro2.getName() +" "+  monstro2.getLife());
            System.out.println(monstro2.getMonster_kil());
            System.out.println(heroi.getLife());

        } while (monstro1.getLife() != 0);





    }
}