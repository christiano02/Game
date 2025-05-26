import components.character.Player;
import components.logic.battleSystem.itens.Item;
import components.weapons.Weapon;

public class Main {
    public static void main(String[] args) {

        Weapon sword = new Weapon();

        Item heal = new Item("Healing Potion","heal");

        Player warrior = new Player("Warrior", false, 0,null,0,100,0,sword);

        warrior.addItemInventory(0, heal);
        warrior.addItemInventory(1, heal);

        heal.use(1, warrior);


    }
}