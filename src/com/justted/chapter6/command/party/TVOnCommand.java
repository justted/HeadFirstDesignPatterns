package com.justted.chapter6.command.party;


/**
 * Created by justted on 2017/4/11.
 */
public class TVOnCommand implements Command {
    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    public void execute(){
        tv.on();
        tv.setInputChannel();
    }

    @Override
    public void undo() {
        tv.off();

    }
}
