package com.kingmhar;

/**
 * Created by Kingmhar on 7/12/16.
 */
public class HealthyBurger extends Burger {

    private int numberOfBrocolli;
    private  int numberOfPickels;
    public HealthyBurger( String meatType) {
        super("BrownRyebread", meatType);

    }

    public int getNumberOfBrocolli() {
        return numberOfBrocolli;
    }

    public void setNumberOfBrocolli(int numberOfBrocolli) {
        this.numberOfBrocolli = numberOfBrocolli *3;
    }

    public int getNumberOfPickels() {
        return numberOfPickels;
    }

    public void setNumberOfPickels(int numberOfPickels) {
        this.numberOfPickels = numberOfPickels * 2;
    }

    public int totalAdditionalHburger()
    {
        return (this.numberOfBrocolli *= 2) + (this.numberOfPickels *= 3);
    }

}
