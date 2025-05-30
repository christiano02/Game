package components.logic.battleSystem.itens;

import components.character.Player;

import java.util.Objects;

public class Item {
    private String name;
    private HealingPotion healingPotion;
    private Player player;

    public Item(){
    }



    //Metodo para usar item e remover item do inventario
    public boolean use(int indexInventory, Player player){
        if (indexInventory >= 0 && indexInventory <= player.getInventory().size()) {
            System.out.println("Vida atual: " + player.getLife());

            Object item = player.getInventory().get(indexInventory);

            if (item instanceof HealingPotion){
                this.healingPotion.setValue(10);
                player.setLife(player.getLife() + this.healingPotion.getValue());
                System.out.println("+ " + this.healingPotion.getValue() + " de vida.");
                System.out.println("Vida atual: " + player.getLife());

            }
            player.getInventory().remove(indexInventory);
        }else {
            System.out.println("Esse index não existe! ");
        }
        return true;
    }
}
