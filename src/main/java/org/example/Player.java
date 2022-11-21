package org.example;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class Player {
   public Wallet myWallet;
    private int position;
    private int position2;
    private int position3;
    private int position4;
    private int money2;
    private int[] ints = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
private boolean[] ownerlist = new boolean[]{false,false,false,false,false,false,false,false,
false,false,false,false,false,false,false,false,false,false,false,
false,false,false,false,false,false,false,false};

    GUI_Player player;
    GUI_Player player1;
    GUI_Player player2;
    GUI_Player player3;
    GUI_Player player4;

    public Player(int money) {
        money2=money;
        myWallet = new Wallet(money2);
    }
    public void definer() {

    }
    public boolean getOwnerlist(int bool) {
        boolean m =ownerlist[bool];
        return m;
    }
    public void setOwnerlist(int bool) {
   ownerlist[bool]= true;
    }

}



