package com.kingmhar;

/**
 * Created by Kingmhar on 7/11/16.
 */
public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean ISduplexPrinter;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean ISduplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.ISduplexPrinter = ISduplexPrinter;
    }

    public void addToner(int fillToner)
    {
        if(this.tonerLevel >=0 && this.tonerLevel <= 100) {
            this.tonerLevel += fillToner;
        }
    }

    public void printPage(int newPage)
    {
        this.numberOfPagesPrinted += newPage;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }
}
