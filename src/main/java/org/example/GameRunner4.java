package org.example;
import Fields.Field;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;
public class GameRunner4 extends GameRunner2 {
    int p3,p4;
    public void GameRun4(GUI_Player play1, GUI_Player play2,GUI_Player play3, GUI_Player play4, GUI_Field[] board2, GUI gui, Player player1, Player player2, Player player3, Player player4){
        gui.showMessage("Player1 tryk enter:");
        p1 += holder.sum();
        gui.setDice(holder.die1.getFacevalue(), holder.die2.getFacevalue());
        int m = p1 % 24;
        if(board2[(p1 - holder.getSum()) % 24].hasCar(play3) && board2[(p1 - holder.getSum()) % 24].hasCar(play2) && board2[(p1 - holder.getSum()) % 24].hasCar(play4)){
            board2[(p1 - holder.getSum()) % 24].removeAllCars();
            board2[(p1 - holder.getSum()) % 24].setCar(play2,true);
            board2[(p1 - holder.getSum()) % 24].setCar(play3,true);
            board2[(p1 - holder.getSum()) % 24].setCar(play4,true);
        } else if (board2[(p1 - holder.getSum()) % 24].hasCar(play2) && board2[(p1 - holder.getSum()) % 24].hasCar(play3)){
            board2[(p1 - holder.getSum()) % 24].removeAllCars();
            board2[(p1 - holder.getSum()) % 24].setCar(play2,true);
            board2[(p1 - holder.getSum()) % 24].setCar(play3,true);
        } else if (board2[(p1 - holder.getSum()) % 24].hasCar(play3) && board2[(p1 - holder.getSum()) % 24].hasCar(play4)) {
            board2[(p1 - holder.getSum()) % 24].removeAllCars();
            board2[(p1 - holder.getSum()) % 24].setCar(play3, true);
            board2[(p1 - holder.getSum()) % 24].setCar(play4, true);
        }
        else if (board2[(p1 - holder.getSum()) % 24].hasCar(play2) && board2[(p1 - holder.getSum()) % 24].hasCar(play4)) {
            board2[(p1 - holder.getSum()) % 24].removeAllCars();
            board2[(p1 - holder.getSum()) % 24].setCar(play2,true);
            board2[(p1 - holder.getSum()) % 24].setCar(play4,true);
        }
        else if (board2[(p1 - holder.getSum()) % 24].hasCar(play2)) {
            board2[(p1 - holder.getSum()) % 24].removeAllCars();
            board2[(p1 - holder.getSum()) % 24].setCar(play2, true);
        }
        else if (board2[(p1 - holder.getSum()) % 24].hasCar(play3)) {
            board2[(p1 - holder.getSum()) % 24].removeAllCars();
            board2[(p1 - holder.getSum()) % 24].setCar(play3, true);
        }
        else if (board2[(p1 - holder.getSum()) % 24].hasCar(play4)) {
            board2[(p1 - holder.getSum()) % 24].removeAllCars();
            board2[(p1 - holder.getSum()) % 24].setCar(play4, true);
        }
        else
            board2[(p1 - holder.getSum()) % 24].removeAllCars();
        board2[m].setCar(play1,true);

        Field playerField1 = board3.fieldlist[m];
        playerField1.landOndField(player1, player2,player3,player4);
        play1.setBalance(player1.myWallet.getMoney());
        play2.setBalance(player2.myWallet.getMoney());
        play3.setBalance(player3.myWallet.getMoney());
        play4.setBalance(player4.myWallet.getMoney());
        if(playerField1.isOwned()&&player1.getOwnerlist(m+1)){
            gui.showMessage("Player1 owns this property");
        }
        else if (playerField1.isOwned()&& player2.getOwnerlist(m+1))
            gui.showMessage("This property belongs to player2, pay rent.");
        else if (playerField1.isOwned()&& player3.getOwnerlist(m+1)){
            gui.showMessage("This property belongs to player3, pay rent.");
        }
        else if (playerField1.isOwned()&& player4.getOwnerlist(m+1)){
            gui.showMessage("This property belongs to player4, pay rent.");}
        else
            System.out.println();

        gui.showMessage("Player2 tryk enter:");
        p2 += holder.sum();
        gui.setDice(holder.die1.getFacevalue(), holder.die2.getFacevalue());
        int n = p2 % 24;
        if(board2[(p2 - holder.getSum()) % 24].hasCar(play3) && board2[(p2 - holder.getSum()) % 24].hasCar(play1) && board2[(p2 - holder.getSum()) % 24].hasCar(play4)){
            board2[(p2 - holder.getSum()) % 24].removeAllCars();
            board2[(p2 - holder.getSum()) % 24].setCar(play1,true);
            board2[(p2 - holder.getSum()) % 24].setCar(play3,true);
            board2[(p2 - holder.getSum()) % 24].setCar(play4,true);
        } else if (board2[(p2 - holder.getSum()) % 24].hasCar(play1) && board2[(p2 - holder.getSum()) % 24].hasCar(play3)){
            board2[(p2 - holder.getSum()) % 24].removeAllCars();
            board2[(p2 - holder.getSum()) % 24].setCar(play1,true);
            board2[(p2 - holder.getSum()) % 24].setCar(play3,true);
        } else if (board2[(p2 - holder.getSum()) % 24].hasCar(play3) && board2[(p2 - holder.getSum()) % 24].hasCar(play4)) {
            board2[(p2 - holder.getSum()) % 24].removeAllCars();
            board2[(p2 - holder.getSum()) % 24].setCar(play3, true);
            board2[(p2 - holder.getSum()) % 24].setCar(play4, true);
        }
        else if (board2[(p2 - holder.getSum()) % 24].hasCar(play1) && board2[(p2 - holder.getSum()) % 24].hasCar(play4)) {
            board2[(p2 - holder.getSum()) % 24].removeAllCars();
            board2[(p2 - holder.getSum()) % 24].setCar(play1,true);
            board2[(p2 - holder.getSum()) % 24].setCar(play4,true);
        }
        else if (board2[(p2 - holder.getSum()) % 24].hasCar(play1)) {
            board2[(p2 - holder.getSum()) % 24].removeAllCars();
            board2[(p2 - holder.getSum()) % 24].setCar(play1, true);
        }
        else if (board2[(p2 - holder.getSum()) % 24].hasCar(play3)) {
            board2[(p2 - holder.getSum()) % 24].removeAllCars();
            board2[(p2 - holder.getSum()) % 24].setCar(play3, true);
        }
        else if (board2[(p2 - holder.getSum()) % 24].hasCar(play4)) {
            board2[(p2 - holder.getSum()) % 24].removeAllCars();
            board2[(p2 - holder.getSum()) % 24].setCar(play4, true);
        }
        else
            board2[(p2 - holder.getSum()) % 24].removeAllCars();
        board2[n].setCar(play2,true);

        Field playerField2 = board3.fieldlist[n];
        playerField2.landOndField(player2, player1,player3,player4);
        play1.setBalance(player1.myWallet.getMoney());
        play2.setBalance(player2.myWallet.getMoney());
        play3.setBalance(player3.myWallet.getMoney());
        play4.setBalance(player4.myWallet.getMoney());
        if(playerField2.isOwned()&&player2.getOwnerlist(n+1)){
            gui.showMessage("Player2 owns this property");
        }
        else if (playerField2.isOwned()&& player1.getOwnerlist(n+1))
            gui.showMessage("This property belongs to player1, pay rent.");
        else if (playerField2.isOwned()&& player3.getOwnerlist(m+1)){
            gui.showMessage("This property belongs to player3, pay rent.");
        }
        else if (playerField2.isOwned()&& player4.getOwnerlist(n+1)){
            gui.showMessage("This property belongs to player4, pay rent.");}
        else
            System.out.println();

        gui.showMessage("Player3 tryk enter:");
        p3 += holder.sum();
        gui.setDice(holder.die1.getFacevalue(), holder.die2.getFacevalue());
        int o = p3 % 24;
        if(board2[(p3 - holder.getSum()) % 24].hasCar(play1) && board2[(p3 - holder.getSum()) % 24].hasCar(play2) && board2[(p3 - holder.getSum()) % 24].hasCar(play4)){
            board2[(p3 - holder.getSum()) % 24].removeAllCars();
            board2[(p3 - holder.getSum()) % 24].setCar(play2,true);
            board2[(p3 - holder.getSum()) % 24].setCar(play1,true);
            board2[(p3 - holder.getSum()) % 24].setCar(play4,true);
        } else if (board2[(p3 - holder.getSum()) % 24].hasCar(play2) && board2[(p3 - holder.getSum()) % 24].hasCar(play1)){
            board2[(p3 - holder.getSum()) % 24].removeAllCars();
            board2[(p3 - holder.getSum()) % 24].setCar(play2,true);
            board2[(p3 - holder.getSum()) % 24].setCar(play1,true);
        } else if (board2[(p3 - holder.getSum()) % 24].hasCar(play1) && board2[(p3 - holder.getSum()) % 24].hasCar(play4)) {
            board2[(p3 - holder.getSum()) % 24].removeAllCars();
            board2[(p3 - holder.getSum()) % 24].setCar(play1, true);
            board2[(p3 - holder.getSum()) % 24].setCar(play4, true);
        }
        else if (board2[(p3 - holder.getSum()) % 24].hasCar(play2) && board2[(p3 - holder.getSum()) % 24].hasCar(play4)) {
            board2[(p3 - holder.getSum()) % 24].removeAllCars();
            board2[(p3 - holder.getSum()) % 24].setCar(play2,true);
            board2[(p3 - holder.getSum()) % 24].setCar(play4,true);
        }
        else if (board2[(p3 - holder.getSum()) % 24].hasCar(play2)) {
            board2[(p3 - holder.getSum()) % 24].removeAllCars();
            board2[(p3 - holder.getSum()) % 24].setCar(play2, true);
        }
        else if (board2[(p3 - holder.getSum()) % 24].hasCar(play1)) {
            board2[(p3 - holder.getSum()) % 24].removeAllCars();
            board2[(p3 - holder.getSum()) % 24].setCar(play1, true);
        }
        else if (board2[(p3 - holder.getSum()) % 24].hasCar(play4)) {
            board2[(p3 - holder.getSum()) % 24].removeAllCars();
            board2[(p3 - holder.getSum()) % 24].setCar(play4, true);
        }
        else
            board2[(p3 - holder.getSum()) % 24].removeAllCars();
        board2[o].setCar(play3,true);

        Field playerField3 = board3.fieldlist[o];
        playerField3.landOndField(player3, player2,player3,player4);
        play1.setBalance(player1.myWallet.getMoney());
        play2.setBalance(player2.myWallet.getMoney());
        play3.setBalance(player3.myWallet.getMoney());
        play4.setBalance(player4.myWallet.getMoney());
        if(playerField3.isOwned()&&player3.getOwnerlist(o+1)){
            gui.showMessage("Player3 owns this property");
        }
        else if (playerField3.isOwned()&& player2.getOwnerlist(o+1))
            gui.showMessage("This property belongs to player2, pay rent.");
        else if (playerField3.isOwned()&& player1.getOwnerlist(o+1)){
            gui.showMessage("This property belongs to player1, pay rent.");
        }
        else if (playerField3.isOwned()&& player4.getOwnerlist(o+1)){
            gui.showMessage("This property belongs to player4, pay rent.");}
        else
            System.out.println();


        gui.showMessage("Player4 tryk enter:");
        p4 += holder.sum();
        gui.setDice(holder.die1.getFacevalue(), holder.die2.getFacevalue());
        int p = p4 % 24;
        if(board2[(p4 - holder.getSum()) % 24].hasCar(play3) && board2[(p4 - holder.getSum()) % 24].hasCar(play2) && board2[(p4 - holder.getSum()) % 24].hasCar(play1)){
            board2[(p4 - holder.getSum()) % 24].removeAllCars();
            board2[(p4 - holder.getSum()) % 24].setCar(play2,true);
            board2[(p4 - holder.getSum()) % 24].setCar(play3,true);
            board2[(p4 - holder.getSum()) % 24].setCar(play1,true);
        } else if (board2[(p4 - holder.getSum()) % 24].hasCar(play2) && board2[(p4 - holder.getSum()) % 24].hasCar(play3)){
            board2[(p4 - holder.getSum()) % 24].removeAllCars();
            board2[(p4 - holder.getSum()) % 24].setCar(play2,true);
            board2[(p4 - holder.getSum()) % 24].setCar(play3,true);
        } else if (board2[(p4 - holder.getSum()) % 24].hasCar(play3) && board2[(p4 - holder.getSum()) % 24].hasCar(play1)) {
            board2[(p4 - holder.getSum()) % 24].removeAllCars();
            board2[(p4 - holder.getSum()) % 24].setCar(play3, true);
            board2[(p4 - holder.getSum()) % 24].setCar(play1, true);
        }
        else if (board2[(p4 - holder.getSum()) % 24].hasCar(play2) && board2[(p4 - holder.getSum()) % 24].hasCar(play1)) {
            board2[(p4 - holder.getSum()) % 24].removeAllCars();
            board2[(p4 - holder.getSum()) % 24].setCar(play2,true);
            board2[(p4 - holder.getSum()) % 24].setCar(play1,true);
        }
        else if (board2[(p4 - holder.getSum()) % 24].hasCar(play2)) {
            board2[(p4 - holder.getSum()) % 24].removeAllCars();
            board2[(p4 - holder.getSum()) % 24].setCar(play2, true);
        }
        else if (board2[(p4 - holder.getSum()) % 24].hasCar(play3)) {
            board2[(p4 - holder.getSum()) % 24].removeAllCars();
            board2[(p4 - holder.getSum()) % 24].setCar(play3, true);
        }
        else if (board2[(p4 - holder.getSum()) % 24].hasCar(play1)) {
            board2[(p4 - holder.getSum()) % 24].removeAllCars();
            board2[(p4 - holder.getSum()) % 24].setCar(play1, true);
        }
        else
            board2[(p4 - holder.getSum()) % 24].removeAllCars();
        board2[p].setCar(play4,true);

        Field playerField4 = board3.fieldlist[p];
        playerField4.landOndField(player4,player2,player3,player1);
        play1.setBalance(player1.myWallet.getMoney());
        play2.setBalance(player2.myWallet.getMoney());
        play3.setBalance(player3.myWallet.getMoney());
        play4.setBalance(player4.myWallet.getMoney());
        if(playerField1.isOwned()&&player4.getOwnerlist(p+1)){
            gui.showMessage("Player4 owns this property");
        }
        else if (playerField4.isOwned()&& player1.getOwnerlist(p+1))
            gui.showMessage("This property belongs to player1, pay rent.");
        else if (playerField4.isOwned()&& player3.getOwnerlist(p+1)){
            gui.showMessage("This property belongs to player3, pay rent.");
        }
        else if (playerField4.isOwned()&& player2.getOwnerlist(p+1)){
            gui.showMessage("This property belongs to player2, pay rent.");}
        else
            System.out.println();
    }

}




