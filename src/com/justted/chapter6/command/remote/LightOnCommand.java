package com.justted.chapter6.command.remote;

/**
 * Created by justted on 2017/4/10.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}

