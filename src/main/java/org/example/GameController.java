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
    private String inputText= "";
   private String Textdata;
    private int cash;
    private boolean winner;
    private GUI gui;
    private GUI_Player [] playArray;
    private int p1;
    private Player [] playerArray,getPlayerArray2;
    private GameBoard [] board4;
    private GUI_Field[] board1,board2= new GUI_Field[24];
    private GameBoard gameBoard;
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
            cash = 20;
        } else if (x == 3) {
            cash = 18;
        } else
            cash = 16;

        GUI_Car car1 = new GUI_Car(Color.RED, Color.RED, GUI_Car.Type.CAR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
        GUI_Player play1 = new GUI_Player("Player1", cash, car1);


        GUI_Car car2 = new GUI_Car(Color.YELLOW, Color.WHITE, GUI_Car.Type.UFO, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
        GUI_Player play2 = new GUI_Player("Player2", cash, car2);


        GUI_Car car3 = new GUI_Car(Color.BLUE, Color.BLACK, GUI_Car.Type.TRACTOR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
        GUI_Player play3 = new GUI_Player("Player3", cash, car3);


        GUI_Car car4 = new GUI_Car(Color.GREEN, Color.BLACK, GUI_Car.Type.RACECAR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
        GUI_Player play4 = new GUI_Player("Player4", cash, car4);


        player1 = new Player("Player1", cash);
        player2 = new Player("Player2", cash);
        player3 = new Player("Player3", cash);
        player4 = new Player("Player3", cash);

        playerArray = new Player[]{player1, player2, player3, player4};
        playArray = new GUI_Player[]{play1, play2, play3, play4};
        if (x == 2) {
            playerArray = new Player[]{player1, player2};
            playArray = new GUI_Player[]{play1, play2};
            gui.addPlayer(play1);
            gui.addPlayer(play2);
        } else if (x == 3) {
            playerArray = new Player[]{player1, player2, player3};
            playArray = new GUI_Player[]{play1, play2, play3};
            gui.addPlayer(play1);
            gui.addPlayer(play2);
            gui.addPlayer(play3);
        } else {
            gui.addPlayer(play1);
            gui.addPlayer(play2);
            gui.addPlayer(play3);
            gui.addPlayer(play4);

        }


// the gameRunners
        while (playing) {
            for (int i = 0; i < x; i++) {
                gui.showMessage(playerArray[i].getName() + " tryk enter:");
                p1 = holder.sum();
                playerArray[i].setPositition(playerArray[i].getPositition() + p1);
                gui.setDice(holder.die1.getFacevalue(), holder.die2.getFacevalue());
                int m = playerArray[i].getPositition() % 24;

                board2[(playerArray[i].getPositition() - holder.getSum()) % 24].removeAllCars();

                board2[m].setCar(playArray[i], true);

                Field playerField1 = board3.fieldlist[m];
                playerField1.landOndField(playerArray[i]);

                play1.setBalance(player1.myWallet.getMoney());
                play2.setBalance(player2.myWallet.getMoney());
                play3.setBalance(player3.myWallet.getMoney());
                play4.setBalance(player4.myWallet.getMoney());

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


}