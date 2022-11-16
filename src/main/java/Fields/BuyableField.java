package Fields;

import org.example.Player;
import org.example.Wallet;

public class BuyableField extends Field {
    private int cost;
    private int playerNumber=1;
    private boolean owned=false;
    private String color;
    private int rentMoney;

    public BuyableField(String fieldName,String color, int BoardNumber,int cost){
        super(fieldName,BoardNumber);
        this.cost=cost;
        this.color=color;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
    @Override
    public void landOndField(Player player1,Player player2) {
       if (owned=false) {
           if (player1.myWallet.getMoney() > cost) {
               player1.myWallet.setSquareMoney(-cost);
               player1.myWallet.UpdateMoney();
               player1.setOwnerlist(getBoardNumber());
               owned = true;
           } else {
               player1.myWallet.setSquareMoney(-cost);
               player1.myWallet.UpdateMoney();
           }
       }
else{
    if(!player1.getOwnerlist(getBoardNumber())){
        player1.myWallet.setSquareMoney(-rentMoney);
        player1.myWallet.UpdateMoney();
    }

           }


    }
    @Override

    public void landOndField(Player player1,Player player2,Player player3) {

    }
    @Override
    public void landOndField(Player player1,Player player2,Player player3, Player player4) {

    }
}