package org.example;

public class Wallet {
    private int money=2;
    private int SquareMoney;


    public Wallet(){

    }

    /**
     *
     * @return
     */
    public int getSquareMoney() {
        return SquareMoney;
    }

    /**
     *
     * @param squareMoney
     */
    public void setSquareMoney(int squareMoney) {
        SquareMoney = squareMoney;
    }

    /**
     *
     * @return
     */
    public int UpdateMoney(){
        if ( 0 >SquareMoney && -SquareMoney> money) {
            money = 0;}
        else {
            money = money + SquareMoney;
        }
        return money;
    }

    public int getMoney() {
        return money;
    }
}