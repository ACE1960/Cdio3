package Fields;

import org.example.Player;

import java.util.ArrayList;

public class PlacementList {

    FieldController fieldController;

    Player player = new Player();
    private final FieldLayout[] fieldList = new FieldLayout[23];

    public void placementField() {
        //[][] er [navn] og [farve]
        String[][] placementField = new String[23][];
        String[] color = new String[23];
        //[1][] er altså [pris][sectionnummer]
        int[][] costList = new int[23][];

        //placementField[0],fieldList[0], color[0] = new String[0] = "Start", new String[0], new String section = ("grb");
        //placementField[0],fieldList[0], color[0] =
        //costlist[0] = new int[1];

        placementField[0] = new String[]{"Start", "get money 2"};
        costList[0] = new int[]{+2, 11}; // Start is Group 11!
        placementField[1] = new String[]{"Gatekjøkkenet", "Brun"};
        costList[1] = new int[]{1, 0};
        placementField[2] = new String[]{"Pizzahuset", "Brun"};
        costList[2] = new int[]{1, 0};
        placementField[3] = new String[]{"Chance"};
        costList[3] = new int[]{0, 8};//Chance == Group 8
        placementField[4] = new String[]{"Godtebutikken", "Lyseblaa"};
        costList[4] = new int[]{1, 1};
        placementField[5] = new String[]{"Iskiosken", "Lyseblaa"};
        costList[5] = new int[]{1, 1};
        placementField[6] = new String[]{"Visiter fængsel"};
        ;
        costList[6] = new int[]{0, 12}; //Visit in prison is Group 12 for setup
        placementField[7] = new String[]{"Museet", "Lilla"};
        costList[7] = new int[]{2, 2};
        placementField[8] = new String[]{"Biblioteket", "Lilla"};
        costList[8] = new int[]{2, 2};
        placementField[9] = new String[]{"Chance"};
        costList[9] = new int[]{0, 8};//Chance == Group 8
        placementField[10] = new String[]{"Skaterparken", "Orange"};
        costList[10] = new int[]{2, 3};
        placementField[11] = new String[]{"Svømmingpoolen", "Orange"};
        costList[11] = new int[]{2, 3};
        placementField[12] = new String[]{"Parkering"};
        costList[12] = new int[]{0, 9};//Parkering er 9 if not optimal.
        placementField[13] = new String[]{"Spillehallen", "Rød"};
        costList[13] = new int[]{3, 4};
        placementField[14] = new String[]{"Kinoen", "Rød"};
        costList[14] = new int[]{3, 4};
        placementField[15] = new String[]{"Chance"};
        costList[15] = new int[]{0, 8};//Chance == Group 8
        placementField[16] = new String[]{"Legetøjsbilbutikken", "Gul"};
        costList[16] = new int[]{3, 5};
        placementField[17] = new String[]{"Dyrehandlen", "Gul"};
        costList[17] = new int[]{3, 5};
        placementField[18] = new String[]{"Fængsel"};
        costList[18] = new int[]{0, 10}; // PRISON IS GROUP 18
        placementField[19] = new String[]{"Bowlinghallen", "Grøn"};
        costList[19] = new int[]{4, 6};
        placementField[20] = new String[]{"ZoologiskHave", "Grøn"};
        costList[20] = new int[]{4, 6};
        placementField[21] = new String[]{"Chance"};
        costList[21] = new int[]{0, 8};
        placementField[22] = new String[]{"Vandlandet", "Blå"};
        costList[22] = new int[]{4, 7};
        placementField[23] = new String[]{"Strandpromonaden", "Blå"};
        costList[23] = new int[]{4, 7};


        //fieldList[0] = new String("")

        //Here we go! Time to load all the data into our favorite "monopoly jr game"


        //data-loop for loading the advanced features/fields.
        for (int i = 0; i < costList.length; i++) {
            for (int j = 0; j < placementField.length; j++) {
                switch (costList[i][0]) {
                    case 0://startfield
                        this.fieldList[i] = new Start();
                        break;
                    case 21: //ChanceCard Regoznice.
                    case 15:
                    case 9:
                    case 3:
                        this.fieldList[i] = new ChanceField();
                        break;
                    case 18:
                        this.fieldList[i] = new Jail("Prison", "Player[X]");
                        break;
                    case 1:
                    case 2:
                    case 4:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 11:
                    case 13:
                    case 14:
                    case 16:
                    case 17:
                    case 19:
                    case 20:
                    case 22:
                    case 23:
                        this.fieldList[i] = new Property(placementField[i][0], "Ground : cost", costList[i][1], placementField[i][2]);
                        break;
                }
            }

       //public String toString(){
         //       String fieldString = "";
           //     for(FieldLayout fieldLayout : fieldList) {
             //       fieldString += fieldLayout.getFieldName() + ":" + fieldLayout.getFieldOwner() + "\n";
              //  }
                //return fieldString;
            }

            }


}
