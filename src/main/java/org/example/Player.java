package org.example;

import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class Player {
    Wallet myWallet;




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



    public void setPlayerAmount(int x, GUI gui, GUI_Field[] board) {
        if(x==2) {
            GUI_Player player1 = new GUI_Player("Billybob", 20);
            gui.addPlayer(player1);
            GUI_Player player2 = new GUI_Player("Michael Schumacher", 20);
            gui.addPlayer(player2);
            board[0].setCar(player1, true);
            board[0].setCar(player2, true);
        }
        //int player1 = player[1].showIntPosition();
        //int player2 = player[2].showIntPosition();
        //int player3 = player[3].showIntPosition();
        //int player4 = player[4].showIntPosition();
        if(x==3) {
            GUI_Player player1 = new GUI_Player("Billy", 18);
            gui.addPlayer(player1);
            GUI_Player player2 = new GUI_Player("Beat", 18);
            gui.addPlayer(player2);
            GUI_Player player3 = new GUI_Player("Justin", 18);
            gui.addPlayer(player3);
            board[0].setCar(player1, true);
            board[0].setCar(player2, true);
            board[0].setCar(player3, true);
        }
        if(x == 4) {
            GUI_Player player1 = new GUI_Player("Billy", 16);
            gui.addPlayer(player1);
            GUI_Player player2 = new GUI_Player("Beat", 16);
            gui.addPlayer(player2);
            GUI_Player player3 = new GUI_Player("Your", 16);
            gui.addPlayer(player3);
            GUI_Player player4 = new GUI_Player("Willy", 16);
            gui.addPlayer(player4);
            board[0].setCar(player1, true);
            board[0].setCar(player2, true);
            board[0].setCar(player3, true);
            board[0].setCar(player4, true);
        }
    }








}
