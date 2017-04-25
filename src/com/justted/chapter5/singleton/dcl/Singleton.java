package com.justted.chapter5.singleton.dcl;

/**
 *懒汉式的双锁模式，兼顾了线程安全与性能
 * Created by justted on 2017/4/7.
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;
    // other useful instance variables here

    private Singleton() {    }

    public static Singleton getInstance(){
        if (uniqueInstance == null){
            synchronized (Singleton.class){
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
    //other useful methods here
}
