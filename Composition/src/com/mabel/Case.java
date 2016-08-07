package com.mabel;

/**
 * Created by mabelroa on 7/5/16.
 */
public class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimesntions;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimesntions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimesntions = dimesntions;
    }

    public void pressPowerButton()
    {
        System.out.println("Power button pressed");

    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimesntions() {
        return dimesntions;
    }
}
