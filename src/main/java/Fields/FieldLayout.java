package Fields;

import org.example.Player;

public abstract class FieldLayout {
    String fieldName;
    String fieldOwner;



    public FieldLayout(String fieldName, String fieldOwner){
        this.fieldName = fieldName;
        this.fieldOwner = fieldOwner;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public String getFieldOwner(){
        return this.fieldOwner;
    }

    public void landmethod(){
        int player;
    }
}
