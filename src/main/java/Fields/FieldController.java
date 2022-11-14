package Fields;

public class FieldController extends FieldLayout {

    public int cost;
    public String color;

    public FieldController(String fieldName, int cost, String color) {
        super(fieldName, color);
        this.fieldName = fieldName;
        this.cost = cost;
        this.color = color;
    }
}
