package com.mabel;

/**
 * Created by mabelroa on 7/5/16.
 */
public class Vehicle {

  private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentDirection = 0;
        this. currentVelocity = 0;

    }

    public void steer(int direction)
    {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): steering at " + currentDirection + " degrees");
    }

    public void move(int velocity, int direction)
    {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): moving at " + currentVelocity + " in direction " + direction);

    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public void stop()
    {
        this.currentVelocity = 0;

    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}

