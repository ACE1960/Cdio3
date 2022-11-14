package Fields;

import org.example.Player;

public class ChanceField extends FieldLayout{

Player player = new Player();

    public ChanceField() {
        super("?",null);
        this.player = new Player();
    }


    public void FieldLanded(Player player, FieldLayout[] fieldLayouts){

    }
}
