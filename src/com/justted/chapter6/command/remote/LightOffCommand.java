package com.justted.chapter6.command.remote;

/**
 * Created by justted on 2017/4/10.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}

