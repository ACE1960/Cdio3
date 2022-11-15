package org.example;

import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;


import java.util.Scanner;

public class Game {
    Holder holder;
boolean Gaming = true;
    int randomNum;
    Wallet wallet;
    Player player2;
    Player player1 = new Player();


    private GameBoard[] board;
    GameBoard gameBoard = new GameBoard(board);

    Scanner scanner = new Scanner(System.in);
    boolean playing = true;
    Player [] playerList;

    String inputText= "";
String Textdata;

    public void play() {
        GUI_Field[] board = GameBoard.makeFields();
        GUI_Field[] board2 = new GUI_Field[24];


        for(int i = 0; i < board2.length; ++i) {
            board2[i] = board[i];
        }


        GUI gui = new GUI(board2);

        Textdata = "" + gui.getUserString(inputText);
        while (playing) {
            System.out.println(gui.getUserButtonPressed(inputText, new String[]{"Tryk!"}));
            gui.getUserInteger(inputText);

            gui.showMessage("Du har indtastet :" + Textdata);
            // System.out.println(Textdata);
            int x = Integer.parseInt(Textdata);
            System.out.println(x);


            player1.setPlayerAmount(x,gui,board2);
            /*
                        for(int i = 0; i <  parseTextdata; ++i) {
                        }
                  //  }
                //} catch (Exception e) {
                  //  System.out.println("Den er helt gakgak");
*/






            updateFlow();
            while (holder.getSum() == 10) {
                System.out.println("Du får et ekstra slag");
                updateFlow();

            }
            if (player1.myWallet.getMoney() >= 3000) {
                playing = false;
                System.out.println("Spiller 1 har vundet");
                break;
            }

            updateFlow2();
            while (holder.getSum() == 10) {
                System.out.println("Du får et ekstra slag");
                updateFlow2();

            }
            if (player2.myWallet.getMoney() >= 3000) {
                playing = false;
                System.out.println("Spiller 2 har vundet");
                break;
            }
        }




    }
    public void PlayerChecker() {
    }








    public void updateFlow(){
        System.out.println("Tryk på enter spiller 1");
        String p1 = scanner.nextLine();
        holder.sum();

        Comment();
        System.out.println(" player 1 har nu "+player1.myWallet.UpdateMoney()+" ");
    }


    public void updateFlow2(){
        System.out.println("Tryk på enter spiller 2");
        String p2 = scanner.nextLine();
        System.out.println();
        holder.sum();

        Comment();
        System.out.println(" player 2 har nu "+player2.myWallet.UpdateMoney()+" ");

    }

    public void updateNum(){
        randomNum = (int)(Math.random() * 6); //random nummer
    }

    public void Comment(){

        }
    }



