package org.example;

import Fields.Field;
import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;


import java.awt.*;


public class GameController {
    Holder holder;
    GameRunner2 gameRunner2;
    GameRunner3 gameRunner3;
    Player player1,player2,player3,player4;
    Board board3;
    private GameBoard[] board;
    boolean playing = true;
    String inputText= "";
    String Textdata;
    int p1,p2,p3,p4;
    GUI gui;
    private GameBoard [] board4;
    GUI_Field[] board1,board2= new GUI_Field[24];
    GameBoard gameBoard;
    public GameController(){
        holder=new Holder();
        board3= new Board();
        gameRunner2 = new GameRunner2();
        gameRunner3 = new GameRunner3();
        board1 = GameBoard.makeFields();
        for(int i = 0; i < board2.length; ++i) {
            board2[i] = board1[i];
        }
        gameBoard = new GameBoard(board4);
        gui = new GUI(board2);
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
                gameRunner2.GameRun2(play1,play2,board2,gui,player1,player2);
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

                while (playing) {
                    gameRunner3.GameRun3(play1,play2,play3,board2,gui,player1,player2,player3);
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

}


// vi skal måske laver flere kontroller klasser

