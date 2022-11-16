package Fields;
import org.example.*;
public class  Field {
    private String fieldName;
    protected int BoardNumber;
    Player player;
    Wallet wallet;
    public  Field (String fieldName, int BoardNumber){
        this.fieldName=fieldName;
        this.BoardNumber=BoardNumber;
        player= new Player();
        wallet= new Wallet();
    }

    public int getBoardNumber() {
        return BoardNumber;
    }


}
