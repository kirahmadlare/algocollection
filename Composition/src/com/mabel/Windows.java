package com.mabel;

/**
 * Created by mabelroa on 7/6/16.
 */
public class Windows {
    private int height;
    private int width;
    private String type;

    public Windows(int height, int width, String type) {
        this.height = height;
        this.width = width;
        this.type = type;
    }


    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getType() {
        return type;
    }
    public void openWindow(){
        System.out.println("window class open windo function");
    }
}
