package com.justted.chapter6.command.remote;

/**
 * Created by justted on 2017/4/10.
 */
public class TV {
    String location;
    int channel;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("TV is on");
    }

    public void off() {
        System.out.println("TV is off");
    }

    public void setInputChannel() {
        this.channel = 3;
        System.out.println("Channel is set for VCR");
    }
}

