package org.example;

import gui_fields.GUI_Brewery;
import gui_fields.GUI_Chance;
import gui_fields.GUI_Field;
import gui_fields.GUI_Jail;
import gui_fields.GUI_Refuge;
import gui_fields.GUI_Shipping;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;
import gui_fields.GUI_Tax;
import java.awt.Color;

 public class  GameBoard {

   public GameBoard(GameBoard[] board2) {
   }


        public static GUI_Field[] makeFields() {
            GUI_Field[] board = new GUI_Field[40];
            int i = 0;
            board[i++] = new GUI_Start("Start", "Modtag: 2", "Modtag 2M,-Når man har passeret start", Color.RED, Color.BLACK);
            board[i++] = new GUI_Street("Gatekjøkkenet", "Pris:  1", "Gatekjøkkenet", "Leje:  1", new Color(101, 67, 33), Color.BLACK);
            board[i++] = new GUI_Street("Pizzahuset", "Pris:  1", "Pizzahuset", "Leje:  1", new Color(101, 67, 33), Color.BLACK);
            board[i++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
            board[i++] = new GUI_Street("Godtebutikken", "Pris:  1", "Godtebutikken", "Leje:  1", new Color(135,206,235), Color.BLACK);
            board[i++] = new GUI_Street("Iskiosken", "Pris:  1", "Iskiosken", "Leje:  1", new Color(135,206,235), Color.BLACK);
            board[i++] = new GUI_Refuge("default", "På besøg", "På Besøg", "På Besøg", Color.WHITE, Color.BLACK);
            board[i++] = new GUI_Street("Museet", "Pris:  2", "Museet", "Leje:  2", new Color(156,81,182), Color.BLACK);
            board[i++] = new GUI_Street("Biblioteket", "Pris:  2", "Biblioteket", "Leje:  2", new Color(156,81,182), Color.BLACK);
            board[i++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
            board[i++] = new GUI_Street("Skaterparken", "Pris:  2", "Skaterparken", "Leje:  2", new Color(255,127,0), Color.BLACK);
            board[i++] = new GUI_Street("Svømmingpoolen", "Pris:  2", "Svømmingpoolen", "Leje:  2", new Color(255,127,0), Color.BLACK);
            board[i++] = new GUI_Refuge("default", "Fri parkering", "Fri Parkering", "Fri Parkering", Color.WHITE, Color.ORANGE);
            board[i++] = new GUI_Street("Spillehallen", "Pris:  3", "Spillehallen", "Leje:  3", new Color(217,33,33), Color.BLACK);
            board[i++] = new GUI_Street("Kinoen", "Pris:  3", "Kinoen", "Leje:  3", new Color(217,33,33), Color.BLACK);
            board[i++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
            board[i++] = new GUI_Street("Legetøjsbilbutikken", "Pris:  3", "Legetøjsbilbutikken", "Leje:  3", new Color(250,253,15), Color.BLACK);
            board[i++] = new GUI_Street("Dyrehandlen", "Pris:  3", "Dyrehandlen", "Leje:  3", new Color(250,253,15), Color.BLACK);
            board[i++] = new GUI_Jail("default", "FÆNGSEL", "FÆNGSEL", "På Besøg I fængsel", new Color(125, 125, 125), Color.BLACK);
            board[i++] = new GUI_Street("Bowlinghallen", "Pris:  4", "Bowlinghallen", "Leje:  4", new Color(75,139,59), Color.BLACK);

            board[i++] = new GUI_Street("ZoologiskHave", "Pris:  4", "ZoologiskHave", "Leje:  4", new Color(75,139,59), Color.BLACK);

            board[i++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
            board[i++] = new GUI_Street("Vandlandet", "Pris:  4", "Vandlandet", "Leje:  4", new Color(25,116,210), Color.BLACK);
            board[i++] = new GUI_Street("Strandpromonadenn", "Pris:  4", "Strandpromonaden", "Leje:  4", new Color(25,116,210), Color.BLACK);

            board[i++] = new GUI_Street("Bredgade", "Pris:  260", "Bredgade", "Leje:  80", Color.WHITE, Color.BLACK);
            board[i++] = new GUI_Street("Kgs. Nytorv", "Pris:  260", "Kongens Nytorv", "Leje:  80", Color.WHITE, Color.BLACK);
            board[i++] = new GUI_Brewery("default", "Carlsberg", "Pris:  150", "Carlsberg bryggeri", "10 x [Terningslag]", Color.BLACK, Color.WHITE);
            board[i++] = new GUI_Street("Ã˜stergade", "Pris:  280", "Ã˜stergade", "Leje:  85", Color.WHITE, Color.BLACK);
            board[i++] = new GUI_Jail("default", "GÃ¥ i fÃ¦ngsel", "GÃ¥ i fÃ¦ngsel", "De fÃ¦ngsles\nSlÃ¥ to ens for at komme ud", new Color(125, 125, 125), Color.BLACK);
            board[i++] = new GUI_Street("Amagertorv", "Pris:  300", "Amagertorv", "Leje:  95", new Color(255, 255, 50), Color.BLACK);
            board[i++] = new GUI_Street("Vimmel-\nskaftet", "Pris:  300", "Vimmelskaftet", "Leje:  95", new Color(255, 255, 50), Color.BLACK);
            board[i++] = new GUI_Chance("?", "PrÃ¸v lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
            board[i++] = new GUI_Street("Nygade", "Pris:  320", "Nygade", "Leje:  100", new Color(255, 255, 50), Color.BLACK);
            board[i++] = new GUI_Shipping("default", "Bornholm", "Pris:  200", "Bornholms redderi", "Leje:  75", Color.WHITE, Color.BLACK);
            board[i++] = new GUI_Chance("?", "PrÃ¸v lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
            board[i++] = new GUI_Street("Frederiks-\nberggade", "Pris:  350", "Frederiksberggade", "Leje:  120", new Color(150, 60, 150), Color.WHITE);
            board[i++] = new GUI_Tax("Ekstra-\nordinÃ¦r\nstatsskat", "Betal 100", "Betal ekstraordinÃ¦r\nstatsskat: kr. 100,-", Color.GRAY, Color.BLACK);
            board[i++] = new GUI_Street("RÃ¥dhuspladsen", "Pris:  400", "RÃ¥dhuspladsen", "Leje:  150", new Color(150, 60, 150), Color.WHITE);
            return board;
        }
    }


