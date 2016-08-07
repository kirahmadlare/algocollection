package com.mabel;

/**
 * Created by mabelroa on 7/6/16.
 */
public class Furniture {
    private String name;
    private String type;
    private String color;

    public Furniture(String name, String type, String color) {
        this.name = name;
        this.type = type;
        this.color = color;
    }
    public void furtnitureDetails(String details)
    {
        System.out.println("blah blah lah Furniture" + details);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
}
