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

    public void landOndField(Player player, Wallet wallet) {
       if (owned=false){
           if(player.myWallet.getMoney()>cost){
               player.myWallet.setSquareMoney(-cost);
               player.myWallet.UpdateMoney();
               player.getOwnerlist();
           }
           else {
               player.myWallet.setSquareMoney(-cost);
               player.myWallet.UpdateMoney();
           }

       }

    }
}