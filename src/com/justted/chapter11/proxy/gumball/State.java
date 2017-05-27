package com.justted.chapter11.proxy.gumball;

import java.io.Serializable;

/**
 * Created by justted on 2017/5/1.
 */
public interface State extends Serializable{
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
