package Fields;

import org.example.Player;

public class Chance extends UnbuyableField{
    private Chancekort chance = new Chancekort();
    private String Beskrivelse;

    public Chance (String fieldName, int BoardNumber){
        super(fieldName,BoardNumber);
        //System.out.println(chance.traekKort());

    }

    public String setChance(){
        this.Beskrivelse = chance.traekKort();
        return chance.traekKort();
    }

    @Override
    public void landOndField(Player player1,Player player2) {
        System.out.println(setChance());
        if(setChance().equals("Ryk frem til START. Modtag M2.")){
            System.out.println("2");
        }

         /*
         if(player1.isInJail()) {
            player1.myWallet.setSquareMoney(-1);
            player1.myWallet.UpdateMoney();
            player1.setInJail(false);
        }
         */

    }
    public void landOndField(Player player1,Player player2,Player player3) {
          /*
         if(player1.isInJail()) {
            player1.myWallet.setSquareMoney(-1);
            player1.myWallet.UpdateMoney();
            player1.setInJail(false);
        }
         */

    }
    public void landOndField(Player player1,Player player2,Player player3, Player player4) {
           /*
         if(player1.isInJail()) {
            player1.myWallet.setSquareMoney(-1);
            player1.myWallet.UpdateMoney();
            player1.setInJail(false);
        }
         */

    }
}
