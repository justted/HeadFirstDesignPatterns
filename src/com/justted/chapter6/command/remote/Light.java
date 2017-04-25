package com.justted.chapter6.command.remote;

/**
 * Created by justted on 2017/4/10.
 */
public class Light {
    String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is on");
    }

    public void off() {
        System.out.println(location + " light is off");
    }
}

