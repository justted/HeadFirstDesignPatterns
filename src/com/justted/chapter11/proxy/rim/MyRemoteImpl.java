package com.justted.chapter11.proxy.rim;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

    public MyRemoteImpl() throws RemoteException {
    }

    public String sayHello() {
        return "Server says, 'Hey'";
    }

    public static void main(String[] args) {
        try{
            LocateRegistry.createRegistry(1099);
            //启动RMI注册服务，指定端口为1099　（1099为默认端口）
            //也可以通过命令 ＄java_home/bin/rmiregistry 1099启动
            //这里用这种方式避免了再打开一个DOS窗口
            //而且用命令rmiregistry启动注册服务还必须事先用RMIC生成一个stub类为它所用
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("Hello", service);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
