package org.example;
import gui_fields.GUI_Field;
import gui_main.GUI;
import Fields.FieldLayout;



//Besøg felt ( er det samme som gratis parkering)
public class VisitField extends FieldLayout {
    public VisitField(){
        super("BesogField","Can't be owned, your visiting, wait till next round to throw the dice");
    }

    @Override
    public void landmethod() {
        super.landmethod();

    }
}
