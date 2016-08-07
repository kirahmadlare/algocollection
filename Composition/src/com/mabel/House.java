package com.mabel;

/**
 * Created by mabelroa on 7/6/16.
 */
public class House {

    private Windows theWindow;
    private Furniture theFur;

    public House(Windows theWindow, Furniture theFur) {
        this.theWindow = theWindow;
        this.theFur = theFur;
    }

    public Windows getTheWindow() {
        return theWindow;
    }

    public Furniture getTheFur() {
        return theFur;
    }

    public  void displayItem()
    {
      theWindow.openWindow();
        theFur.furtnitureDetails("OH YES NAME BLAH");
    }
}
