package com.justted.chapter5.singleton.threadsafe;

/**
 * 懒汉式的线程安全写法，但是就是有点浪费性能与内存
 * Created by justted on 2017/4/7.
 */
public class Singleton {
    private static Singleton uniqueInstance;
    // other useful instance variables here

    private Singleton() {    }

    public static synchronized Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    //other useful methods here
}
