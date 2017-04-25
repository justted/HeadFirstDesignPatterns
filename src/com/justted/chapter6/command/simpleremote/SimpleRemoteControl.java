package com.justted.chapter6.command.simpleremote;

/**
 * Created by justted on 2017/4/11.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
