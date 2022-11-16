package Fields;

import org.example.Player;
import org.example.Wallet;

public class Start extends Field{
    private int money;
    public Start (String fieldName, int BoardNumber,int money){
        super(fieldName,BoardNumber);
        this.money=money;
    }


    public void landOndFIeld(Player player1, Player player2) {
        player1.myWallet.setSquareMoney(money);
        player2.myWallet.UpdateMoney();
    }
    public void landOndField(Player player1,Player player2) {

    }
    public void landOndField(Player player1,Player player2,Player player3) {

    }
    public void landOndField(Player player1,Player player2,Player player3, Player player4) {

    }

}



