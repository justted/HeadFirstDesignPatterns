package com.justted.chapter11.proxy.gumball;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by justted on 2017/5/7.
 */
public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;
    String getLocation() throws RemoteException;
    State getState() throws RemoteException;
}
