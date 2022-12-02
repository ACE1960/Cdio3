package org.example;

public class GameRunner3  {
    private void GameFLow (Player [] playerArray) {
        int NumberOfP = playerArray.length;
        for (int i =0;i<NumberOfP;i++){
            gui.showMessage("Player1 tryk enter:");
            p1 += holder.sum();
            gui.setDice(holder.die1.getFacevalue(), holder.die2.getFacevalue());
            int m = p1 % 24;
            if (board2[(p1 - holder.getSum()) % 24].hasCar(play2)) {
                board2[(p1 - holder.getSum()) % 24].removeAllCars();
                board2[(p1 - holder.getSum()) % 24].setCar(play2, true);
            } else
                board2[(p1 - holder.getSum()) % 24].removeAllCars();
            board2[m].setCar(play1, true);

            Field playerField1 = board3.fieldlist[m];
            playerField1.landOndField(player1, player2);
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


