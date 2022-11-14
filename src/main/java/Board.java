
import Fields.*;


public class Board {
 public Board(){
  Field[] fieldlist = new Field[24];
  fieldlist[0]= new Start("Start",1,2);
  fieldlist[1]= new BuyableField("Gatekjønnet","Brun",2,1);
  fieldlist[2]= new BuyableField("Pizzahuset","Brun",3,1);
  fieldlist[3]= new Chance("Chance",4);
  fieldlist[4]= new BuyableField("Godtebutikken","Lyseblå",5,1);
  fieldlist[5]= new BuyableField("Iskiosken","Lyseblå",6,1);
  fieldlist[6]= new BuyableField("Iskiosken","Lyseblå",7,1);
  fieldlist[7]= new Visitation("På Besøg",8);
  fieldlist[8]= new BuyableField("Museet","Lilla",8,2);
  fieldlist[9]= new BuyableField("Biblioteket","Lilla",9,2);
  fieldlist[10]= new Chance("Chance",10);
  fieldlist[11]= new BuyableField("Skaterparken","Orange",11,2);
  fieldlist[12]= new BuyableField("Svømmingpool","Orange",12,2);
  fieldlist[13]= new Visitation("Fri Parkering",13);
  fieldlist[14]= new BuyableField("Spillehallen","Rød",14,3);


 }


}
