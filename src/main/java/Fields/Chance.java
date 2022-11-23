package Fields;
import gui_main.GUI;
import org.example.Player;
import org.example.Wallet;



public class Chance extends UnbuyableField{
    private Chancekort chance =new Chancekort();




    public Chance (String fieldName, int BoardNumber){
        super(fieldName,BoardNumber);
        System.out.println(chance.traekKort()); //Printer et tilfældigt kort
    }


    @Override
    public void landOndField(Player player1,Player player2) {

    }

    public void landOndField(Player player1,Player player2,Player player3) {
        //System.out.println(chancekort[random.nextInt(chancekort.length)]);
    }
    public void landOndField(Player player1,Player player2,Player player3, Player player4) {
        //System.out.println(chancekort[random.nextInt(chancekort.length)]);
    }

}
