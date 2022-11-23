package Fields;
import java.util.Random;
public class Chancekort {
    Random random = new Random();
    private String[] kort;
    public Chancekort (){
        Kort();
    }

 public void Kort(){
        kort = new String[16];
        kort [0] = "Ryk frem til START. Modtag M2.";
        kort[1] = "GRATIS FELT! Ryk frem til et orange felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du BETALE leje til ejeren.";
        kort[2] = "Ryk 1 felt frem, eller tag et chancekort mere.";
        kort[3] = "Du har spist for meget slik BETAL M2 til banken.";
        kort[4] = "GRATIS FELT! Ryk frem til et orange eller grønt felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du BETALE leje til ejeren.";
        kort[5] = "Du løslades uden omkostninger. Behold dette kort, indtil du får brug fra det.";
        kort[6] = "Ryk frem til Strandpromenaden.";
        kort[7] = "Det er din fødselsdag! Alle giver dig M1. TILLYKKE MED FØDSLESDAGEN!";
        kort[8] = "Du har lavet alle dine lektier!  MODTAG M2 fra banken.";
        kort[9] = "GRATIS FELT! Ryk frem til et rødt felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du BETALE leje til ejeren.";
        kort[10] = "GRATIS FELT!  Ryk frem til Skaterparken for at lave det perfekte grind! Hvis ingen ejer den, får du den GRATIS! Ellers skal du BETALE lege til ejeren.";
        kort[11] = "GRATIS FELT! Ryk frem til et pink eller mørkeblåt felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du BETALE leje til ejeren.";
        kort[12] = "GRATIS FELT! Ryk frem til et lyseblåt felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du BETALE leje til ejeren.";
        kort[13] = "GRATIS FELT! Ryk frem til et lyseblåt eller rødt felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du BETALE leje til ejeren.";
        kort[14] = "Ryk op til 5 felter frem.";
        kort[15] = "GRATIS FELT! Ryk frem til et brunt eller gult felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du BETALE leje til ejeren.";
        traekKort();
    }

    /**
     * Trækker et tilfældigt kort fra Kort
     */
    public String traekKort(){
        return kort[random.nextInt(kort.length)];
    }



}
