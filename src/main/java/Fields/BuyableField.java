package Fields;

import org.example.Player;


public class BuyableField extends Field {
    private  int cost;
    private boolean owned=false;
    private String color;
    private  int rentMoney;

    public BuyableField(String fieldName,String color, int BoardNumber,int cost){
        super(fieldName,BoardNumber);
        this.cost=cost;
        this.color=color;
    }

    @Override
    // if player can afford the house scenario.
    public void landOndField(Player player1,Player player2) {
       if (owned == false) {
           if (player1.myWallet.getMoney() > cost) {
               player1.myWallet.setSquareMoney(-cost);
               player1.myWallet.UpdateMoney();
               player1.setOwnerlist(getBoardNumber());
               owned = true;
           }
           // if player is broke scenario. He will lose the rest of his money hahah.
           else {
               if (!player1.getOwnerlist(getBoardNumber())) {
                   player1.myWallet.setSquareMoney(-cost);
                   player1.myWallet.UpdateMoney();
               }
           }
       }
       else {
           if (!player1.getOwnerlist(getBoardNumber())) {
               // scenario where player can afford the rent.
               if(player1.myWallet.getMoney()>rentMoney) {
                   player1.myWallet.setSquareMoney(-rentMoney);
                   player1.myWallet.UpdateMoney();
                   player2.myWallet.setSquareMoney(rentMoney);
                   player2.myWallet.UpdateMoney();
               }
               else {
                   // sceario where player cannot afford to pay rent.
                   player1.myWallet.setSquareMoney(-rentMoney);
                   player1.myWallet.UpdateMoney();
                   player2.myWallet.setSquareMoney(player1.myWallet.getSquareMoney());
                   player2.myWallet.UpdateMoney();
               }
           }
       }
    }
    @Override
    public void landOndField(Player player1,Player player2,Player player3) {
        if (owned == false) {
            if (player1.myWallet.getMoney() > cost) {
                player1.myWallet.setSquareMoney(-cost);
                player1.myWallet.UpdateMoney();
                player1.setOwnerlist(getBoardNumber());
                owned = true;
            }
            else {
                if (!player1.getOwnerlist(getBoardNumber())) {
                    player1.myWallet.setSquareMoney(-cost);
                    player1.myWallet.UpdateMoney();
                }
            }
        }

        else {
            if (!player1.getOwnerlist(getBoardNumber())) {
                if(player2.getOwnerlist(getBoardNumber())) {
                    if(player1.myWallet.getMoney()>cost) {
                        player1.myWallet.setSquareMoney(-rentMoney);
                        player1.myWallet.UpdateMoney();
                        player2.myWallet.setSquareMoney(rentMoney);
                        player2.myWallet.UpdateMoney();
                    }
                    else{
                        player1.myWallet.setSquareMoney(-rentMoney);
                        player1.myWallet.UpdateMoney();
                        player2.myWallet.setSquareMoney(player1.myWallet.getMoney());
                        player2.myWallet.UpdateMoney();
                    }
                }
                else  {
                    if(player1.myWallet.getMoney()>cost) {
                        player1.myWallet.setSquareMoney(-rentMoney);
                        player1.myWallet.UpdateMoney();
                        player3.myWallet.setSquareMoney(rentMoney);
                        player3.myWallet.UpdateMoney();
                    }
                    else{
                        player1.myWallet.setSquareMoney(-rentMoney);
                        player1.myWallet.UpdateMoney();
                        player3.myWallet.setSquareMoney(player1.myWallet.getMoney());
                        player3.myWallet.UpdateMoney();
                    }
                }
            }
        }
    }
    @Override
    public void landOndField(Player player1,Player player2,Player player3, Player player4) {
        if (owned==false) {
            if (owned == false) {
                if (player1.myWallet.getMoney() > cost) {
                    player1.myWallet.setSquareMoney(-cost);
                    player1.myWallet.UpdateMoney();
                    player1.setOwnerlist(getBoardNumber());
                    owned = true;
                }

                else {
                    if (!player1.getOwnerlist(getBoardNumber())) {
                        player1.myWallet.setSquareMoney(-cost);
                        player1.myWallet.UpdateMoney();
                    }
                }
            }
        }
        else {
            if (!player1.getOwnerlist(getBoardNumber())) {

                if(player2.getOwnerlist(getBoardNumber())) {
                    if(player1.myWallet.getMoney()>cost) {
                        player1.myWallet.setSquareMoney(-rentMoney);
                        player1.myWallet.UpdateMoney();
                        player2.myWallet.setSquareMoney(rentMoney);
                        player2.myWallet.UpdateMoney();
                    }
                    else{
                        player1.myWallet.setSquareMoney(-rentMoney);
                        player1.myWallet.UpdateMoney();
                        player2.myWallet.setSquareMoney(player1.myWallet.getMoney());
                        player2.myWallet.UpdateMoney();
                    }

                }
                else if (player3.getOwnerlist(getBoardNumber()))  {
                    if(player1.myWallet.getMoney()>cost) {
                        player1.myWallet.setSquareMoney(-rentMoney);
                        player1.myWallet.UpdateMoney();
                        player3.myWallet.setSquareMoney(rentMoney);
                        player3.myWallet.UpdateMoney();
                    }
                    else{
                        player1.myWallet.setSquareMoney(-rentMoney);
                        player1.myWallet.UpdateMoney();
                        player3.myWallet.setSquareMoney(player1.myWallet.getMoney());
                        player3.myWallet.UpdateMoney();
                    }
                }
                else{
                    if(player1.myWallet.getMoney()>cost) {
                        player1.myWallet.setSquareMoney(-rentMoney);
                        player1.myWallet.UpdateMoney();
                        player4.myWallet.setSquareMoney(rentMoney);
                        player4.myWallet.UpdateMoney();
                    }
                    else{
                        player1.myWallet.setSquareMoney(-rentMoney);
                        player1.myWallet.UpdateMoney();
                        player4.myWallet.setSquareMoney(player1.myWallet.getMoney());
                        player4.myWallet.UpdateMoney();
                    }
                }
            }
        }
    }
}