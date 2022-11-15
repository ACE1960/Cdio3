package org.example;

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.awt.*;

public class Player {
    Wallet myWallet;


    GUI gui_Player;
    GUI gui;
    Player player;

    private int position;
    private int[] ints = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};


    public Player() {
        myWallet = new Wallet();
    }
    public int[] moveSquare (int n) {

        if (n >= 0) {

            for (int j = 0; j < n; j++) {
                int first = ints[0];

                for (int i = 0; i < ints.length - 1; i++)
                    ints[i] = ints[i + 1];

                ints[ints.length - 1] = first;
            }}
        return ints;
    }
    public int showIntPosition(){
        position=ints[0];
        return position;
    }



    public void setPlayerAmount(int x, GUI gui) {



        if(x==2) {
            GUI_Player player1 = new GUI_Player("Sebastian Vettel", 1000);
            gui.addPlayer(player1);
            GUI_Player player2 = new GUI_Player("Michael Schumacher", 1000);
            gui.addPlayer(player2);
        }
        //int player1 = player[1].showIntPosition();
        //int player2 = player[2].showIntPosition();
        //int player3 = player[3].showIntPosition();
        //int player4 = player[4].showIntPosition();
        if(x== 3) {
            gui.addPlayer(new GUI_Player("Brian1"));
            gui.addPlayer(new GUI_Player("Brian2"));
            gui.addPlayer(new GUI_Player("Brian3"));
        }

        if(x == 4) {
            gui.addPlayer(new GUI_Player("Brian1"));
            gui.addPlayer(new GUI_Player("Brian2"));
            gui.addPlayer(new GUI_Player("Brian3"));
            gui.addPlayer(new GUI_Player("Brian4"));
        }

    }








}
