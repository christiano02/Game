package components.logic.battleSystem.itens;

import components.character.Player;

import java.util.Objects;

public class Item {
    private String name;
    private String type;
    private Player player;
    public Item(){
    }

    public Item(String name, String type){
        this.name = name;
        this.type = type;
    }

    //Metodo para usar item e remover item do inventario
    public boolean use(int indexInventory, Player player){
        if (indexInventory >= 0 && indexInventory <= player.getInventory().size()) {
            System.out.println("Vida atual: " + player.getLife());
            if (Objects.equals(this.type, "heal")) {
                player.setLife(player.getLife() + 10);
                System.out.println("+ " + 10 + " de vida.");
                System.out.println("Vida atual: " + player.getLife());

            }
            player.getInventory().remove(indexInventory);
        }
        return true;
    }
}
