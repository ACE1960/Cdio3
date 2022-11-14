package Fields;
public class BuyableField extends Field {
    private int cost;
    private String color;
    private boolean owned=false;
    public BuyableField(String fieldName,String color, int BoardNumber,int cost){
        super(fieldName,BoardNumber);
        this.cost=cost;
        this.color=color;
    }

    @Override
    void landOndFIeld() {
       // if(owned==false){

         //   owned=true;
        //}
        //else {
          //  if
        //}
    }
}