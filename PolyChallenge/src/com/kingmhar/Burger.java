package com.kingmhar;

/**
 * Created by Kingmhar on 7/12/16.
 */
public class Burger {

    private String breadRollType;
    private int  numberOfLettuce ;
    private int  numberOfIstomato;
    private int  numberOfCarrot;
    private String  meatType;
    private int meatPrice;
    private int breadPrice;

    private int lettucePrice = 2;
    private int tomatoPrice = 1;
    private int carrotPrice = 2;

    public Burger(String breadRollType, String meatType ) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.numberOfIstomato = 0;
        this.numberOfLettuce = 0;
        this.numberOfCarrot = 0;
        this.meatPrice = 2;
        this.breadPrice = 1;

    }

    public int getNumberOfLettuce() {
        return numberOfLettuce;
    }

    public void setNumberOfLettuce(int numberOfLettuce) {
        this.numberOfLettuce = numberOfLettuce;
    }

    public int getNumberOfIstomato() {
        return numberOfIstomato;
    }

    public void setNumberOfIstomato(int numberOfIstomato) {
        this.numberOfIstomato = numberOfIstomato;
    }

    public int getNumberOfCarrot() {
        return numberOfCarrot;
    }

    public void setNumberOfCarrot(int numberOfCarrot) {
        this.numberOfCarrot = numberOfCarrot;
    }

    public void getTotalPrice()
    {
        this.numberOfCarrot *= carrotPrice;
        this.numberOfIstomato *= tomatoPrice;
        this.numberOfLettuce *= lettucePrice;
        int total = this.numberOfCarrot + this.numberOfLettuce + this.numberOfIstomato + this.meatPrice + this.breadPrice;
        System.out.println("Total price of burger is " +  total);
    }
}
