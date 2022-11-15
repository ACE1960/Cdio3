package Fields;
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

    public int landOndField( boolean[] liste) {
       if (owned=false){
           owned=true;
           liste[getBoardNumber()]=true;
           return -cost;
       }
else
        return -rentMoney;

    }
}