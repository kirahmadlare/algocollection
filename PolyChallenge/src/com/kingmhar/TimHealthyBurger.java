package com.kingmhar;

/**
 * Created by Kingmhar on 7/12/16.
 */
public class TimHealthyBurger extends TimBurger{
    private String healthyExtra1Name;
    private double heatlhyExtra1Price;
    private String healthyExtra2Name;
    private double heatlhyExtra2Price;


    public TimHealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public  void addHealthAdditona1(String name, double price){
        this.healthyExtra1Name = name;
        this.heatlhyExtra1Price = price;
    }

    public  void addHealthAdditona2(String name, double price){
        this.healthyExtra2Name = name;
        this.heatlhyExtra2Price = price;
    }

    @Override
    public double itemizeBurger() {
       double hamburgerPrice =  super.itemizeBurger();
        if (this.healthyExtra1Name != null)
        {
            hamburgerPrice += this.heatlhyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.heatlhyExtra1Price);
        }

        if (this.healthyExtra2Name != null)
        {
            hamburgerPrice += this.heatlhyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.heatlhyExtra2Price);
        }

        return hamburgerPrice;
    }
}
