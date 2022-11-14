package org.example;

import gui_main.GUI;
import org.w3c.dom.Text;

import java.util.Scanner;

public class Game {
    Holder holder;

    int randomNum;
    Wallet wallet;
    Player player1, player2;
    GameBoard gameBoard;

    Scanner scanner = new Scanner(System.in);

    GUI gui = new GUI();

    boolean playing = true;
    String inputText= "";




    public void play() {
        gui.showMessage("Hvor mange spillere vil du have?");
        String TextData = "" + gui.getUserString(inputText);

        while (playing) {

            System.out.println(gui.getUserButtonPressed(inputText, new String[]{"Tryk!"}));

            gui.getUserInteger(inputText);
            //gui.getUserInteger(TextData,data,data);
            //gui.getUserString(TextData + "");
            gui.showMessage("Du har indtastet :" + TextData);
            System.out.println(TextData);



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







    public void updateFlow(){
        System.out.println("Tryk på enter spiller 1");
        String p1 = scanner.nextLine();
        holder.sum();
        System.out.println("Spiller 1 du slog " + holder.getSum() + " og landet på "+ gameBoard.location[holder.getSum()] + " Denne Square Værdi gav : " + gameBoard.points[holder.getSum()]);
        player1.myWallet.setSquareMoney(gameBoard.points[holder.getSum()]);
        Comment();
        System.out.println(" player 1 har nu "+player1.myWallet.UpdateMoney()+" ");
    }


    public void updateFlow2(){
        System.out.println("Tryk på enter spiller 2");
        String p2 = scanner.nextLine();
        System.out.println();
        holder.sum();
        System.out.println("Spiller 2 du slog " + holder.getSum() + " og landet på "+ gameBoard.location[holder.getSum()] + " Denne Square Værdi gav : " + gameBoard.points[holder.getSum()]);
        player2.myWallet.setSquareMoney(gameBoard.points[holder.getSum()]);
        Comment();
        System.out.println(" player 2 har nu "+player2.myWallet.UpdateMoney()+" ");

    }

    public void updateNum(){
        randomNum = (int)(Math.random() * 6); //random nummer
    }

    public void Comment(){
        if(gameBoard.points[holder.getSum()]>=0){
            System.out.print(gameBoard.positiveComments[randomNum]);
        } else if(gameBoard.points[holder.getSum()]<0){
            System.out.print(gameBoard.negativeComments[randomNum]);
        }
    }

}

