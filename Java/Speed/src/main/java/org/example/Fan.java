//Cannon Rivera, 10/15/2025, Object Instances
//This Programs Allows you to create a Fan, and display it.
package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Fan {
    public static void main(String[] args) {
        Fan defaultFan = new Fan();
        System.out.println(fanString(defaultFan));

        Fan customFam = new Fan(SLOW,true,4,"Red");
        System.out.println(fanString(customFam));

        Collection<Fan> fans = Arrays.asList(defaultFan,customFam);
        System.out.println(collectionString(fans));
    }

    public static String fanString(Fan fan) {
        return "Your fan's speed is " + fan.speed +
                ",\n it's status is " + fan.on +
                ",\n it's radius is " + fan.radius +
                ",\n and it's color is " + fan.color + "\n";
    }
    public static String collectionString(Collection<Fan> fans) {
        String output = "Fans: \n";
        for (Fan fan : fans) {
            output += "Your fan's speed is " + fan.speed +
                    ",\n it's status is " + fan.on +
                    ",\n it's radius is " + fan.radius +
                    ",\n and it's color is " + fan.color + "\n";
        }
        return output;
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