package com.justted.chapter6.command.simpleremote;

/**
 * Created by justted on 2017/4/11.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
