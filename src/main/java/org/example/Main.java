package org.example;

import gui_main.GUI;

public class Main {
    public static void main(String[] args) {


        GUI gui = new GUI();

        Game game = new Game();

        /**
         * Referer til game.play() som er et true loop, der sørger for at spillet løber indtil der er vundet.
         */
        game.play();

    }
}


