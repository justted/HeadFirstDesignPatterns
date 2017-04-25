package com.justted.chapter6.command.simpleremote;

/**
 * Created by justted on 2017/4/11.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
