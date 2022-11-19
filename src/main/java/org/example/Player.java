package org.example;
import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Player.iPlayerValidator;
import gui_main.GUI;

import java.awt.*;

public class Player extends GUI_Player {
    public Wallet myWallet;
    private int position;
    private int position2;
    private int position3;
    private int position4;
    private int money2;
    private int id;
    private int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
    private boolean[] ownerlist = new boolean[]{false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false};



    //Player player1;

    GUI_Player player3;
    GUI_Player player4;
    iPlayerValidator validator;
    iPlayerValidator validator2;
    private static String nextId = "";
    String name;

    private int id2;

    public Player(String id, int money) {
        super(nextId,money);
        id = nextId;





        money2 = money;
        myWallet = new Wallet(money2);
    }



    public boolean getOwnerlist(int bool) {
        boolean m = ownerlist[bool];
        return m;
    }

    public void setOwnerlist(int bool) {
        ownerlist[bool] = true;
    }

    public int[] moveSquare(int n) {

        if (n >= 0) {

            for (int j = 0; j < n; j++) {
                int first = ints[0];

                for (int i = 0; i < ints.length - 1; i++)
                    ints[i] = ints[i + 1];

                ints[ints.length - 1] = first;
            }
        }
        return ints;
    }

    // public int showIntPosition(){
    //position=ints[0];
    // return position;
    //  }
    public void setPlayerAmount(int x, GUI gui, GUI_Field[] board, GUI_Player player1) {



        GUI_Car car1 = new GUI_Car(Color.RED, Color.BLACK, GUI_Car.Type.RACECAR, GUI_Car.Pattern.HORIZONTAL_GRADIANT);


        player1 = new GUI_Player("Sebastian",20,car1);
        gui.addPlayer(player1);


        board[0].setCar(player1, true);
        getCar();
        moveCar1(board, position2,player1);


        //moveCar1(board, position);
        //moveCar1(board, position2);
    }
        public void setPlayerAmount2 ( int x, GUI gui, GUI_Field[]board, GUI_Player player2){
                GUI_Car car2 = new GUI_Car(Color.RED, Color.BLACK, GUI_Car.Type.RACECAR, GUI_Car.Pattern.HORIZONTAL_GRADIANT);

                player2 = new GUI_Player("tian", 20,car2);
                gui.addPlayer(player2);

                board[0].setCar(player2, true);
                getCar();
                moveCar2(board, position2,player2);


            }


        /*
        if (x == 3) {
            player1 = new GUI_Player("Billy", 18);
            gui.addPlayer(player1);
            player2 = new GUI_Player("Beat", 18);
            gui.addPlayer(player2);
            player3 = new GUI_Player("Justin", 18);
            gui.addPlayer(player3);
            board[0].setCar(player1, true);
            board[0].setCar(player2, true);
            board[0].setCar(player3, true);


        }
        if (x == 4) {
            player1 = new GUI_Player("Billy", 16);
            gui.addPlayer(player1);
            player2 = new GUI_Player("Beat", 16);
            gui.addPlayer(player2);
            player3 = new GUI_Player("Your", 16);
            gui.addPlayer(player3);
            player4 = new GUI_Player("Willy", 16);
            gui.addPlayer(player4);
            //board[0].setCar(player1, true);
            board[0].setCar(player2, true);
            board[0].setCar(player3, true);
            board[0].setCar(player4, true);
            moveCar1(board, position);
            moveCar2(board,position2);
        }
        */


            public void moveCar1 (GUI_Field[]board,int position, GUI_Player player1){
                board[position].setCar(player1, true);

            }

            public void moveCar2 (GUI_Field[]board,int position2, GUI_Player player2){
                board[position2].setCar(player2, true);
            }
        }



