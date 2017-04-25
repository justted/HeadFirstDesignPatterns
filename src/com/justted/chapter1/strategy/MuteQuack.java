package com.justted.chapter1.strategy;

/**
 * Created by Justted on 2017/3/19.
 */
public class MuteQuack implements QuackBehavior {
    public void quack(){
        System.out.println("<<Silence>>");
    }
}
