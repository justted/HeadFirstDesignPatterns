package com.justted.chapter11.proxy.gumball;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by justted on 2017/5/1.
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{

    static State soldOutState;
    static State noQuarterState;
    static State hasQuarterState;
    static State soldState;
    static State winnerState;

    static State state = soldOutState;
    int count = 0;
    String location;

    public GumballMachine(String location, int numberGumballs) throws RemoteException{
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
        this.location = location;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall(){
        System.out.println("A gumballmonitor comes rolling out the slot...");
        if (count != 0){
            count = count - 1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount(){
        return count;
    }

    public String getLocation() {
        return location;
    }

    public State getState() {
        return state;
    }

    public void refill(int numGumBalls) {  //把机子再装上
        this.count = numGumBalls;
        state = noQuarterState;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: " + count + " gumballmonitor");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is " + state + "\n");
        return result.toString();
    }
}


