package com.justted.chapter11.proxy.rim;

import java.rmi.Naming;

/**
 * Created by Justted on 2017/3/9.
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go(){
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/Hello");
            //HelloInterface hello = (HelloInterface)Naming.lookup("//192.168.1.105:1099/Hello");
            String s = service.sayHello();
            System.out.println(s);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
