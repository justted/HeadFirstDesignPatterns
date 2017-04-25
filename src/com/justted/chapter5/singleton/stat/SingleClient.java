package com.justted.chapter5.singleton.stat;

/**
 * 急切实例化，饿汉式
 * Created by justted on 2017/4/7.
 */
public class SingleClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}
