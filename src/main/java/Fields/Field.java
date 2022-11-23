
package Fields;
import org.example.*;
public class  Field {
    protected boolean ischance =false;
    private String fieldName;
    protected final  int BoardNumber;
    Player player1,player2,player3,player4;

    public  Field (String fieldName, int BoardNumber){
        this.fieldName=fieldName;
        this.BoardNumber=BoardNumber;
        player1= new Player(16);
        player2= new Player(16);
        player3= new Player(16);
        player4= new Player(16);
    }

    public int getBoardNumber() {
        return BoardNumber;
    }
    public void landOndField(Player player1,Player player2) {

    }
    public void landOndField(Player player1,Player player2,Player player3) {

    }
    public void landOndField(Player player1,Player player2,Player player3, Player player4) {

    }

}
