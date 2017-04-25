package com.justted.chapter7.adapter.ducks;

/**
 * Created by justted on 2017/4/12.
 */
public class TurkeyTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(duck);

        for(int i=0;i<10;i++) { //实现10次，看看鸭子飞了几次
            System.out.println("The DuckAdapter says...");
            duckAdapter.gobble();
            duckAdapter.fly();
        }
    }
}

