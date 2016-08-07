package com.kingmhar;

/**
 * Created by Kingmhar on 7/11/16.
 */
public class PrinterTim {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public PrinterTim(boolean duplex, int tonerLevel) {

        if(tonerLevel > -1 && tonerLevel <= 100)
        {
            this.tonerLevel = tonerLevel;
        }else
        {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;

    }

    private int addToner (int tonerAmount)
    {
        if(tonerAmount >0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else
        {
            return -1;
        }

    }

    public int printPages(int pages)
    {
        int pagesToPrint = pages;
        if(this.duplex)
        {
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return  pagesToPrint;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
