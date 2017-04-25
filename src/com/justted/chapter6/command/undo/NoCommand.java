package com.justted.chapter6.command.undo;

/**
 * Created by justted on 2017/4/10.
 */
public class NoCommand implements Command {
    public void execute(){}

    @Override
    public void undo() {}
}
