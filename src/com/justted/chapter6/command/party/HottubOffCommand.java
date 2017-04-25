package com.justted.chapter6.command.party;


/**
 * Created by justted on 2017/4/10.
 */
public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.setTemperature(98);
        hottub.off();
    }

    @Override
    public void undo() {
        hottub.on();
    }
}

