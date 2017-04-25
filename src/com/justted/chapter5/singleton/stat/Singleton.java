package com.justted.chapter5.singleton.stat;

/**
 * 急切实例化，饿汉式
 * Created by justted on 2017/4/7.
 */
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();
    // other useful instance variables here

    private Singleton() {    }

    public static Singleton getInstance(){
        return uniqueInstance;
    }
    //other useful methods here
}
