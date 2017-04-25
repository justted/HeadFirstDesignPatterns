package com.justted.chapter6.command.party;

/**
 * Created by justted on 2017/4/10.
 */
public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.on();
        hottub.setTemperature(104);
        hottub.bubblesOn();
    }

    @Override
    public void undo() {
        hottub.off();
    }
}

