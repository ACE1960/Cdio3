package Fields;

public class Property extends FieldLayout {


    public int propertyOwner;
    private final int buildingPrice;

    private String color;

    public Property(String name,String info,int price, String color ){
        super(name,info);
        this.color = color;
        this.buildingPrice = price;
        //this.houseAmount = amountChain;
    }


    }

