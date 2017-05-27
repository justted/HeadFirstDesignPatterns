package com.justted.chapter11.proxy.gumball;

import java.rmi.RemoteException;

/**
 * Created by justted on 2017/5/7.
 */
public class GumballMonitor {
    GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report(){
        try {
            System.out.println("Gumball Machine: " + gumballMachine.getLocation());
            System.out.println("Current inventory: " + gumballMachine.getCount() + " gumballs");
            System.out.println("Current state: " + gumballMachine.getState());
        }catch (RemoteException e){
            e.printStackTrace();
        }

    }
}
