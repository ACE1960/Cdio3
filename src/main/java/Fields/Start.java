package Fields;

import org.example.Player;
import org.example.Wallet;

public class Start extends Field{
    private int money;
    public Start (String fieldName, int BoardNumber,int money){
        super(fieldName,BoardNumber);
        this.money=money;
    }
    @Override

    public void landOndField(Player player1,Player player2) {
        player1.myWallet.setSquareMoney(money);
        player1.myWallet.UpdateMoney();
    }
    @Override
    public void landOndField(Player player1,Player player2,Player player3) {
        player1.myWallet.setSquareMoney(money);
        player1.myWallet.UpdateMoney();
    }
    @Override
    public void landOndField(Player player1,Player player2,Player player3, Player player4) {
        player1.myWallet.setSquareMoney(money);
        player1.myWallet.UpdateMoney();
    }

}



