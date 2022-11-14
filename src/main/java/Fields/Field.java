package Fields;

public class Field {
    private String fieldName;
    private int BoardNumber;
    public  Field (String fieldName, int BoardNumber){
        this.fieldName=fieldName;
        this.BoardNumber=BoardNumber;
    }

    public int getBoardNumber() {
        return BoardNumber;
    }

    public void landOndFIeld();

}
