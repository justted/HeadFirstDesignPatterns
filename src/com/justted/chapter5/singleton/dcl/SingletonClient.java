package com.justted.chapter5.singleton.dcl;

/**
 * 懒汉式的双锁模式，兼顾了线程安全与性能
 * Created by justted on 2017/4/8.
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}
