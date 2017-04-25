package com.justted.chapter6.command.remote;

/**
 * Created by justted on 2017/4/10.
 */
public class Hottub {
    boolean on;
    int temperature;

    public Hottub() {
    }

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }

    public void bubblesOn() {
        if (on) {
            System.out.println("Hottub is bubbling!");
        }
    }

    public void bubblesOff() {
        if (on) {
            System.out.println("Hottub is not bubbling");
        }
    }

    public void jetsOn() {
        if (on) {
            System.out.println("Hottub jets are on");
        }
    }

    public void jetsOff() {
        if (on) {
            System.out.println("Hottub jets are off");
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void heat() {
        temperature = 105;
        System.out.println("Hottub is heating to a steaming 105 degrees");
    }

    public void cool() {
        temperature = 98;
        System.out.println("Hottub is cooling to 98 degrees");
    }

}

