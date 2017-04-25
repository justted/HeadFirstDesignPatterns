package com.justted.chapter6.command.party;

/**
 * Created by justted on 2017/4/11.
 */
public class TVOffCommand implements Command{
    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    public void execute(){
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
