package com.justted.chapter6.command.undo;

/**
 * Created by justted on 2017/4/10.
 */
public interface Command {
    void execute();
    void undo();
}
