package com.justted.chapter8.templatemethod.barista;

/**
 * Created by justted on 2017/4/18.
 */
public class Coffee extends CaffeineBeverage{

    public void brew(){
        System.out.println("Dripping Coffee through filter");
    }

    public void addCondiments(){
        System.out.println("Adding Sugar and Milk");
    }
}
