package components.logic.battleSystem.itens;

import components.character.Player;

import java.util.Objects;

public class Item {
    private String name;
    private String type;
    private Player player;
    public Item(){
    }

    public Item(String name, String type, Player player){
        this.name = name;
        this.type = type;
        this.player = player;
    }

    public boolean UseItem(Player player){
        System.out.println("Vida atual: " + player.getLife());
        if(Objects.equals(this.type, "heal")){
            player.setLife(player.getLife() + 10);
            System.out.println("+ " + 10 + "de vida.");
            System.out.println("Vida atual: " + player.getLife());
        }
        return true;
    }
}
