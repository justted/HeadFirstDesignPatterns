package com.justted.chapter6.command.remote;

/**
 * Created by justted on 2017/4/10.
 */
public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }
}

