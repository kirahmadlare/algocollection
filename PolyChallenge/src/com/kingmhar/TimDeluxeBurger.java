package com.kingmhar;

/**
 * Created by Kingmhar on 7/13/16.
 */
public class TimDeluxeBurger extends TimBurger {

    public TimDeluxeBurger() {
    super("Deluxe","Sausage & bacon",14.54,"White");
    super.addHamburgerAddtiona1("Chips",2.75);
        super.addHamburgerAddtiona2("Drink",1.81);
    }

    @Override
    public void addHamburgerAddtiona1(String name, double price) {
        System.out.println("Cannot add additional item to deluxy bueger");
    }

    @Override
    public void addHamburgerAddtiona2(String name, double price) {
        System.out.println("Cannot add additional item to deluxy bueger");
    }

    @Override
    public void addHamburgerAddtiona3(String name, double price) {
        System.out.println("Cannot add additional item to deluxy bueger");
    }

    @Override
    public void addHamburgerAddtiona4(String name, double price) {
        System.out.println("Cannot add additional item to deluxy bueger");
    }
}
