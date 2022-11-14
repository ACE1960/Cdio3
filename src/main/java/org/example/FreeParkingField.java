package org.example;
import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import gui_main.GUI;
import gui_fields.GUI_Ownable;

import Fields.FieldLayout;

//Gratis Parkering felt, vent til næste runde før du må kaste terning. (er det samme som besøg felt)
public class FreeParkingField extends FieldLayout {


    public FreeParkingField(){
        super("Free Parking Field","Can't be owned, wait till next round to throw the dice");
    }

    @Override
    public void landmethod() {
        super.landmethod();

    }
}
