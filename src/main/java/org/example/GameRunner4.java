package org.example;
import Fields.Field;
import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;
import java.awt.*;
public class GameController {
    Holder holder;

    Player player1,player2,player3,player4;
    Board board3;
    private GameBoard[] board;
    boolean playing = true;
    String inputText= "";
    String Textdata;
    GUI gui;
    int p1;
    Player [] playerArray;
    private GameBoard [] board4;
    GUI_Field[] board1,board2= new GUI_Field[24];
    GameBoard gameBoard;
    public GameController() {
        holder=new Holder();
        board3= new Board();

        board1 = GameBoard.makeFields();
        for(int i = 0; i < board2.length; ++i) {
            board2[i] = board1[i];
        }
        gameBoard = new GameBoard(board4);
        gui = new GUI(board2);
    }

    public void play() throws InterruptedException {
        Textdata = "" + gui.getUserString(inputText);


        int x = Integer.parseInt(Textdata);

        if (x == 2) {
            GUI_Car car1 = new GUI_Car(Color.BLUE, Color.BLACK, GUI_Car.Type.CAR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
            GUI_Player play1 = new GUI_Player("Player1", 20, car1);
            gui.addPlayer(play1);

            GUI_Car car2 = new GUI_Car(Color.RED, Color.RED, GUI_Car.Type.TRACTOR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
            GUI_Player play2 = new GUI_Player("Player2", 20, car2);
            gui.addPlayer(play2);

            player1 = new Player("Player1", 20);
            player2 = new Player("Player2", 20);
            board2[0].setCar(play1, true);
            board2[0].setCar(play2, true);
            playerArray= new Player[]{player1,player2};

        } else if (x == 3) {
            GUI_Car car1 = new GUI_Car(Color.RED, Color.RED, GUI_Car.Type.TRACTOR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
            GUI_Player play1 = new GUI_Player("Player1", 18, car1);
            gui.addPlayer(play1);

            GUI_Car car2 = new GUI_Car(Color.YELLOW, Color.WHITE, GUI_Car.Type.UFO, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
            GUI_Player play2 = new GUI_Player("Player2", 18, car2);
            gui.addPlayer(play2);

            GUI_Car car3 = new GUI_Car(Color.BLUE, Color.WHITE, GUI_Car.Type.CAR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
            GUI_Player play3 = new GUI_Player("Player3", 18, car3);
            gui.addPlayer(play3);

            player1 = new Player("Player1", 18);
            player2 = new Player("Player2", 18);
            player3 = new Player("Player3", 18);
            board2[0].setCar(play1, true);
            board2[0].setCar(play2, true);
            board2[0].setCar(play3, true);

            board2[0].setCar(play1, true);
            board2[0].setCar(play2, true);
            board2[0].setCar(play3, true);
            playerArray= new Player[]{player1,player2,player3};
        } else {
            GUI_Car car1 = new GUI_Car(Color.RED, Color.RED, GUI_Car.Type.CAR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
            GUI_Player play1 = new GUI_Player("Player1", 16, car1);
            gui.addPlayer(play1);

            GUI_Car car2 = new GUI_Car(Color.YELLOW, Color.WHITE, GUI_Car.Type.UFO, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
            GUI_Player play2 = new GUI_Player("Player2", 16, car2);
            gui.addPlayer(play2);

            GUI_Car car3 = new GUI_Car(Color.BLUE, Color.BLACK, GUI_Car.Type.TRACTOR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
            GUI_Player play3 = new GUI_Player("Player3", 16, car3);
            gui.addPlayer(play3);

            GUI_Car car4 = new GUI_Car(Color.GREEN, Color.BLACK, GUI_Car.Type.RACECAR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
            GUI_Player play4 = new GUI_Player("Player4", 16, car4);
            gui.addPlayer(play4);

            player1 = new Player("Player1", 16);
            player2 = new Player("Player2", 16);
            player3 = new Player("Player3", 16);
            player4 = new Player("Player3", 16);
            board2[0].setCar(play1, true);
            board2[0].setCar(play2, true);
            board2[0].setCar(play3, true);
            board2[0].setCar(play4, true);
            playerArray= new Player[]{player1,player2,player3,player4};

        }

    }
    private void GameFLow (Player [] playerArray) {
        int NumberOfP = playerArray.length;
        GUI_Car car1 = new GUI_Car(Color.BLUE, Color.BLACK, GUI_Car.Type.CAR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
        GUI_Player play1 = new GUI_Player("Player1", 20, car1);
        gui.addPlayer(play1);

        GUI_Car car2 = new GUI_Car(Color.RED, Color.RED, GUI_Car.Type.TRACTOR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
        GUI_Player play2 = new GUI_Player("Player2", 20, car2);
        gui.addPlayer(play2);
        for (int i =0;i<NumberOfP;i++){
            gui.showMessage("Player1 tryk enter:");
            p1 += holder.sum();
            playerArray[i].setPositition(p1);
            gui.setDice(holder.die1.getFacevalue(), holder.die2.getFacevalue());
            int m = playerArray[i].getPositition() % 24;

            board2[(playerArray[i].getPositition() - holder.getSum()) % 24].removeAllCars();
            board2[m].setCar(play1, true);

            Field playerField1 = board3.fieldlist[m];
            playerField1.landOndField(playerArray[i]);
            play1.setBalance(player1.myWallet.getMoney());
            play2.setBalance(player2.myWallet.getMoney());
            if (player1.myWallet.getMoney() == 0) {
                winner = true;
                gui.showMessage("VI HAR EN VINDER DING DING, TILLYKKE PLAYER 2, Du har vundet verdens bedste spil");

            } else if (player2.myWallet.getMoney() == 0) {
                winner = true;
                gui.showMessage("VI HAR EN VINDER DING DING, TILLYKKE PLAYER 1, The CHAMP");

            }
            if (playerField1.isOwned() && player1.getOwnerlist(m + 1)) {
                gui.showMessage("Player1 owns this property");

            } else if (playerField1.isOwned() && !player1.getOwnerlist(m + 1))
                gui.showMessage("This property belongs to player2, pay rent player1");
            else if (player1.isInJail())
                gui.showMessage("You in jail, pay a fine of 1 next round.");
            else
                System.out.println();

        }
    }

}