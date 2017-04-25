package com.justted.chapter6.command.remote;

/**
 * Created by justted on 2017/4/10.
 */
public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.high();
    }
}
