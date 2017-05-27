package com.justted.chapter11.proxy.gumballmonitor;

/**
 * Created by justted on 2017/5/1.
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
