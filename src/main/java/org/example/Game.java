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
    Player player1, player2;
    private GameBoard[] board;
    GameBoard gameBoard = new GameBoard(board);

    Scanner scanner = new Scanner(System.in);
    boolean playing = true;
    String inputText= "";
String Textdata;

    public void play() {
        GUI_Field[] board = GameBoard.makeFields();
        GUI_Field[] board2 = new GUI_Field[24];


        for(int i = 0; i < board2.length; ++i) {
            board2[i] = board[i];
        }


        GUI gui = new GUI(board2);
        GUI_Player gui_Player = new GUI_Player("Brian123456789012345667");
        Textdata = "" + gui.getUserString(inputText);
        while (playing) {
            System.out.println(gui.getUserButtonPressed(inputText, new String[]{"Tryk!"}));
            gui.getUserInteger(inputText);
            //gui.getUserInteger(TextData,data,data);
            //gui.getUserString(TextData + "");
            gui.showMessage("Du har indtastet :" + Textdata);
            System.out.println(Textdata);
            //while (Gaming) {
              //  try {
                //    if (Textdata == "4") {



            gui.addPlayer(gui_Player);
            gui.addPlayer(new GUI_Player("Brian123123213213213213"));
            gui.addPlayer(new GUI_Player("Brian2"));
            gui.addPlayer(new GUI_Player("Brian3"));

                        board[0].setCar(gui_Player, true);
                        board[0].setCar(gui_Player, false);
                        System.out.println(board[0].hasCar(gui_Player));
                        int parseTextdata = Integer.parseInt(Textdata);
                        for(int i = 0; i <  parseTextdata; ++i) {
                        }
                  //  }
                //} catch (Exception e) {
                  //  System.out.println("Den er helt gakgak");







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



