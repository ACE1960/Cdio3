package org.example;

import gui_codebehind.GUI_FieldFactory;
import gui_fields.GUI_Field;
import gui_main.GUI;

public class Main {
    public static void main(String[] args) {



        Game game = new Game();
        /**
         * Referer til game.play() som er et true loop, der sørger for at spillet løber indtil der er vundet.
         */
        game.play();

    }
}


