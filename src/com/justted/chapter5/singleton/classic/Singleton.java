package com.justted.chapter5.singleton.classic;

// NOTE: This is not thread safe!线程不安全，懒汉式的经典写法，延迟了实例化

/**
 * Created by Justted on 2017/4/5.
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {    }

    public static Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    //other useful methods here
}
