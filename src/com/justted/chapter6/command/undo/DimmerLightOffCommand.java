package com.justted.chapter6.command.undo;

/**
 * Created by justted on 2017/4/11.
 */
public class DimmerLightOffCommand implements Command {
    Light light;
    int prevLevel;

    public DimmerLightOffCommand(Light light) {
        this.light = light;
        prevLevel = 100;
    }

    @Override
    public void execute() {
        prevLevel = light.getLevel();
        light.off();
    }

    @Override
    public void undo() {
        light.dim(prevLevel);
    }
}
