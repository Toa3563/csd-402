//Cannon Rivera, 10/15/2025, Object Instances

package org.example;

public class Fan {
    public static void main(String[] args) {
        Fan defaultFan = new Fan();
        System.out.println(defaultFan);
        Fan customFam = new Fan(SLOW,true,4,"Red");
        System.out.println(customFam);
    }

    @Override
    public String toString() {
        return "Your fan's speed is " + speed +
                ",\n it's status is " + on +
                ",\n it's radius is " + radius +
                ",\n and it's color is " + color;
    }

    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = STOPPED;
    private boolean on = false;
    private int radius = 6;
    public String color = "White";

    public Fan(){
    }

    public Fan(int speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}