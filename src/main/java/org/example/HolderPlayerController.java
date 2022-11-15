package org.example;

import org.example.Holder;
import org.example.Player;

public class HolderPlayerController {
    public HolderPlayerController(){

    }
    Holder holder2= new Holder();
    Player playertest = new Player();
    public void carMove(){
        holder2.sum();
        playertest.moveSquare(holder2.getSum());
        System.out.println(playertest.showIntPosition());

    }
}
