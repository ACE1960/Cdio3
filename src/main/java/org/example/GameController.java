package org.example;

import Fields.Field;
import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Ownable;
import gui_fields.GUI_Player;
import gui_main.GUI;


import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class GameController {
    Holder holder;
    boolean Gaming = true;
    Player player1,player2,player3,player4;
    Board board3;
    private GameBoard[] board;
    boolean playing = true;
    Scanner scanner;
    String inputText= "";
    String Textdata;
    Boolean start = true;
    int p1,p2,p3,p4;
    GUI gui;
    private GameBoard [] board4;
    GUI_Field[] board1,board2= new GUI_Field[24];
    GameBoard gameBoard;
    public GameController(){
        holder=new Holder();
        board3= new Board();
        board1 = GameBoard.makeFields();
        for(int i = 0; i < board2.length; ++i) {
            board2[i] = board1[i];
        }
        gameBoard = new GameBoard(board4);
        gui = new GUI(board2);
        scanner = new Scanner(System.in);
    }

    public void play() {
        Textdata = "" + gui.getUserString(inputText);
        int x = Integer.parseInt(Textdata);

        if(x==2) {
            GUI_Car car1 = new GUI_Car(Color.BLUE, Color.BLACK, GUI_Car.Type.CAR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
            GUI_Player play1 = new GUI_Player("Player1",20,  car1);
            gui.addPlayer(play1);

            GUI_Car car2 = new GUI_Car(Color.RED, Color.RED, GUI_Car.Type.TRACTOR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
            GUI_Player play2 = new GUI_Player("Player2",20,  car2);
            gui.addPlayer(play2);

            player1 = new Player(20);
            player2= new Player(20);
            board2[0].setCar(play1,true);
            board2[0].setCar(play2,true);
            while (playing) {
                gui.showMessage("Player1 tryk enter:");
                p1 += holder.sum();
                gui.setDice(holder.die1.getFacevalue(), holder.die2.getFacevalue());
                int m = p1 % 24;
                if(board2[(p1 - holder.getSum()) % 24].hasCar(play2)){
                    board2[(p1 - holder.getSum()) % 24].removeAllCars();
                    board2[(p1 - holder.getSum()) % 24].setCar(play2,true);
                }
                else
                    board2[(p1 - holder.getSum()) % 24].removeAllCars();
                board2[m].setCar(play1, true);

                Field playerField1 = board3.fieldlist[m];
                playerField1.landOndField(player1, player2);
                play1.setBalance(player1.myWallet.getMoney());
                play2.setBalance(player2.myWallet.getMoney());
                if(playerField1.isOwned()&&player1.getOwnerlist(m+1)){
                    gui.showMessage("Player1 owns this property");

                }
                else if (playerField1.isOwned()&& !player1.getOwnerlist(m+1))
                    gui.showMessage("This property belongs to player2, pay rent player1");
                else
                    System.out.println();


                gui.showMessage("Player2 tryk enter:");
                p2 += holder.sum();
                gui.setDice(holder.die1.getFacevalue(), holder.die2.getFacevalue());
                int n = p2 % 24;
                if(board2[(p2 - holder.getSum()) % 24].hasCar(play1)){
                    board2[(p2 - holder.getSum()) % 24].removeAllCars();
                    board2[(p2 - holder.getSum()) % 24].setCar(play1,true);
                }
                else
                    board2[(p2 - holder.getSum()) % 24].removeAllCars();
                board2[n].setCar(play2, true);
                Field playerField2 = board3.fieldlist[n];
                playerField2.landOndField(player2, player1);
                play2.setBalance(player2.myWallet.getMoney());
                play1.setBalance(player1.myWallet.getMoney());
                if(playerField2.isOwned()&&player2.getOwnerlist(n+1)){
                    gui.showMessage("Player2 owns this property");
                }
                else if (playerField2.isOwned()&& !player2.getOwnerlist(n+1))
                    gui.showMessage("This property belongs to player1, pay rent player2");
                else
                    System.out.println();
            }

        }
        else if (x==3){
            GUI_Car car1 = new GUI_Car(Color.RED, Color.RED, GUI_Car.Type.TRACTOR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
            GUI_Player play1 = new GUI_Player("Player1",18,  car1);
            gui.addPlayer(play1);

            GUI_Car car2 = new GUI_Car(Color.YELLOW, Color.WHITE, GUI_Car.Type.UFO, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
            GUI_Player play2 = new GUI_Player("Player2",18,  car2);
            gui.addPlayer(play2);

            GUI_Car car3 = new GUI_Car(Color.BLUE, Color.WHITE, GUI_Car.Type.CAR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
            GUI_Player play3 = new GUI_Player("Player3",18,  car3);
            gui.addPlayer(play3);

            player1 = new Player(18);
            player2= new Player(18);
            player3 = new Player(18);

            board2[0].setCar(play1,true);
            board2[0].setCar(play2,true);
            board2[0].setCar(play3,true);

                while (playing) {
                    gui.showMessage("Player1 tryk enter:");
                    p1 += holder.sum();
                    gui.setDice(holder.die1.getFacevalue(), holder.die2.getFacevalue());
                    int m = p1 % 24;
                    if(board2[(p1 - holder.getSum()) % 24].hasCar(play3) && board2[(p1 - holder.getSum()) % 24].hasCar(play2)){
                        board2[(p1 - holder.getSum()) % 24].removeAllCars();
                        board2[(p1 - holder.getSum()) % 24].setCar(play2,true);
                        board2[(p1 - holder.getSum()) % 24].setCar(play3,true);
                    } else if (board2[(p1 - holder.getSum()) % 24].hasCar(play2)){
                        board2[(p1 - holder.getSum()) % 24].removeAllCars();
                        board2[(p1 - holder.getSum()) % 24].setCar(play2,true);

                    } else if (board2[(p1 - holder.getSum()) % 24].hasCar(play3)) {
                        board2[(p1 - holder.getSum()) % 24].removeAllCars();
                        board2[(p1 - holder.getSum()) % 24].setCar(play3,true);
                    } else
                        board2[(p1 - holder.getSum()) % 24].removeAllCars();
                    board2[m].setCar(play1,true);

                    Field playerField1 = board3.fieldlist[m];
                    playerField1.landOndField(player1, player2,player3);
                    play1.setBalance(player1.myWallet.getMoney());
                    play2.setBalance(player2.myWallet.getMoney());
                    play3.setBalance(player3.myWallet.getMoney());
                    if(playerField1.isOwned()&&player1.getOwnerlist(m+1)){
                        gui.showMessage("Player1 owns this property");

                    }
                    else if (playerField1.isOwned()&& player2.getOwnerlist(m+1))
                        gui.showMessage("This property belongs to player2, pay rent.");
                    else if (playerField1.isOwned()&& player2.getOwnerlist(m+1)){
                        gui.showMessage("This property belongs to player2, pay rent.");
                    }
                    else
                        System.out.println();

                    gui.showMessage("Player2 tryk enter:");
                    p2 += holder.sum();
                    gui.setDice(holder.die1.getFacevalue(), holder.die2.getFacevalue());
                    int n = p2 % 24;
                    if(board2[(p2 - holder.getSum()) % 24].hasCar(play1) && board2[(p2 - holder.getSum()) % 24].hasCar(play3)){
                        board2[(p2 - holder.getSum()) % 24].removeAllCars();
                        board2[(p2 - holder.getSum()) % 24].setCar(play1,true);
                        board2[(p2 - holder.getSum()) % 24].setCar(play3,true);
                    } else if (board2[(p2 - holder.getSum()) % 24].hasCar(play3)){
                        board2[(p2 - holder.getSum()) % 24].removeAllCars();
                        board2[(p2 - holder.getSum()) % 24].setCar(play3,true);

                    } else if (board2[(p2 - holder.getSum()) % 24].hasCar(play1)) {
                        board2[(p2 - holder.getSum()) % 24].removeAllCars();
                        board2[(p2 - holder.getSum()) % 24].setCar(play1,true);
                    } else
                        board2[(p2 - holder.getSum()) % 24].removeAllCars();
                    board2[n].setCar(play2,true);

                    Field playerField2 = board3.fieldlist[n];
                    playerField2.landOndField(player2, player1,player3);
                    play1.setBalance(player1.myWallet.getMoney());
                    play2.setBalance(player2.myWallet.getMoney());
                    play3.setBalance(player3.myWallet.getMoney());
                    if(playerField2.isOwned()&&player2.getOwnerlist(n+1)){
                        gui.showMessage("Player2 owns this property");

                    }
                    else if (playerField2.isOwned()&& player2.getOwnerlist(n+1))
                        gui.showMessage("This property belongs to player1, pay rent.");
                    else if (playerField2.isOwned()&& player3.getOwnerlist(n+1)){
                        gui.showMessage("This property belongs to player3, pay rent.");
                    }
                    else
                        System.out.println();

                    gui.showMessage("Player3 tryk enter:");
                    p3 += holder.sum();
                    gui.setDice(holder.die1.getFacevalue(), holder.die2.getFacevalue());
                    int o = p3 % 24;
                    if(board2[(p3 - holder.getSum()) % 24].hasCar(play1) && board2[(p3 - holder.getSum()) % 24].hasCar(play2)){
                        board2[(p3 - holder.getSum()) % 24].removeAllCars();
                        board2[(p3 - holder.getSum()) % 24].setCar(play2,true);
                        board2[(p3 - holder.getSum()) % 24].setCar(play1,true);
                    } else if (board2[(p3 - holder.getSum()) % 24].hasCar(play2)){
                        board2[(p3 - holder.getSum()) % 24].removeAllCars();
                        board2[(p3 - holder.getSum()) % 24].setCar(play2,true);

                    } else if (board2[(p3 - holder.getSum()) % 24].hasCar(play1)) {
                        board2[(p3 - holder.getSum()) % 24].removeAllCars();
                        board2[(p3 - holder.getSum()) % 24].setCar(play1,true);
                    } else
                        board2[(p3 - holder.getSum()) % 24].removeAllCars();
                    board2[o].setCar(play3,true);

                    Field playerField3 = board3.fieldlist[o];
                    playerField3.landOndField(player3, player1,player2);
                    play1.setBalance(player1.myWallet.getMoney());
                    play2.setBalance(player2.myWallet.getMoney());
                    play3.setBalance(player3.myWallet.getMoney());
                    if(playerField3.isOwned()&&player3.getOwnerlist(o+1)){
                        gui.showMessage("Player3 owns this property");

                    }
                    else if (playerField3.isOwned()&& player2.getOwnerlist(o+1))
                        gui.showMessage("This property belongs to player2, pay rent.");
                    else if (playerField3.isOwned()&& player1.getOwnerlist(o+1)){
                        gui.showMessage("This property belongs to player1, pay rent.");
                    }
                    else
                        System.out.println();

                }
        }
        else {
            GUI_Car car1 = new GUI_Car(Color.RED, Color.RED, GUI_Car.Type.CAR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
            GUI_Player play1 = new GUI_Player("Player1",16,  car1);
            gui.addPlayer(play1);

            GUI_Car car2 = new GUI_Car(Color.YELLOW, Color.WHITE, GUI_Car.Type.UFO, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
            GUI_Player play2 = new GUI_Player("Player2",16,  car2);
            gui.addPlayer(play2);

            GUI_Car car3 = new GUI_Car(Color.BLUE, Color.BLACK, GUI_Car.Type.TRACTOR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
            GUI_Player play3 = new GUI_Player("Player3",16,  car3);
            gui.addPlayer(play3);
            GUI_Car car4 = new GUI_Car(Color.GREEN, Color.BLACK, GUI_Car.Type.RACECAR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
            GUI_Player play4 = new GUI_Player("Player4",16,  car4);
            gui.addPlayer(play4);

            player1 = new Player(16);
            player2= new Player(16);
            player3 = new Player(16);
            player4 = new Player(16);

            while (playing) {
                updateFlow1(play1);
                updateFlow2(play2);
                updateFlow3(play3);
                updateFlow4(play4);
            }
        }
    }

    private void updateFlow1(GUI_Player play1){
        gui.showMessage("Player1 tryk enter:");
        gui.getUserButtonPressed(inputText, new String[]{"Tryk!"});

        p1+=holder.sum();
        gui.setDice(holder.die1.getFacevalue(),holder.die2.getFacevalue());
        int m=p1%24;
        board2[(p1-holder.getSum())%24].removeAllCars();
        board2[m].setCar(play1,true);
        Field playerField1 = board3.fieldlist[m];
        playerField1.landOndField(player1,player2);
        play1.setBalance(player1.myWallet.getMoney());

    }
    private void updateFlow2(GUI_Player play2){
        gui.showMessage("Player2 tryk enter:");
        gui.getUserButtonPressed(inputText, new String[]{"Tryk!"});

        p2+=holder.sum();
        gui.setDice(holder.die1.getFacevalue(),holder.die2.getFacevalue());
        int n = p2%24;
        System.out.println(n);
        board2[(p2-holder.getSum())%24].removeAllCars();
        board2[n].setCar(play2,true);
        Field playerField2 = board3.fieldlist[n];
        playerField2.landOndField(player2,player1);
        play2.setBalance(player2.myWallet.getMoney());

    }
    private void updateFlow3(GUI_Player play3){
        gui.showMessage("Player3 tryk enter:");
        gui.getUserButtonPressed(inputText, new String[]{"Tryk!"});
        p3+=holder.sum();
        gui.setDice(holder.die1.getFacevalue(),holder.die2.getFacevalue());
        int b = p3%24;
        board2[(p3-holder.getSum())%24].removeAllCars();
        board2[b].setCar(play3,true);
    }
    private void updateFlow4(GUI_Player play4){
        gui.showMessage("Player4 tryk enter:");
        gui.getUserButtonPressed(inputText, new String[]{"Tryk!"});
        p4+=holder.sum();
        gui.setDice(holder.die1.getFacevalue(),holder.die2.getFacevalue());
        int v = p4%24;
        board2[(p4-holder.getSum())%24].removeAllCars();
        board2[v].setCar(play4,true);
    }
public void setCarStart(){

}
}

// vi skal måske laver flere kontroller klasser

