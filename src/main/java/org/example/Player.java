package org.example;

import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.awt.*;

public class Player {
    Wallet myWallet;
    Player player = new Player();
    GUI_Field[] fields = new GUI_Field[25];
    GUI gui = new GUI(fields);

    GUI_Player car = new GUI_Player("John Ranmbo", 1000);


    public Player() {
        myWallet = new Wallet();
    //this.car = new GUI(gui.addPlayer("John ranbo",1000));


    }
    // public void update(){
//
    //value = myWallet.SQpoints[8];
    //  }
}
