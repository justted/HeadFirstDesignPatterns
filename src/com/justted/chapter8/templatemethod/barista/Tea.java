package com.justted.chapter8.templatemethod.barista;

/**
 * Created by justted on 2017/4/18.
 */
public class Tea extends CaffeineBeverage{

    public void brew(){
        System.out.println("Steeping the tea");
    }

    public void addCondiments(){
        System.out.println("Adding Lemon");
    }
}
