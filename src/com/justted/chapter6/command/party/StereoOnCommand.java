package com.justted.chapter6.command.party;

/**
 * Created by justted on 2017/4/11.
 */
public class StereoOnCommand implements Command {
    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}