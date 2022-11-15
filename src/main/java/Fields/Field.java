package Fields;

public class  Field {
    private String fieldName;
    protected int BoardNumber;
    public  Field (String fieldName, int BoardNumber){
        this.fieldName=fieldName;
        this.BoardNumber=BoardNumber;
    }

    public int getBoardNumber() {
        return BoardNumber;
    }


}
