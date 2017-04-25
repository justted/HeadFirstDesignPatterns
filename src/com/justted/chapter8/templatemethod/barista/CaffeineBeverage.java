package com.justted.chapter8.templatemethod.barista;

/**
 * Created by justted on 2017/4/20.
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWatetr();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void addCondiments();
    abstract void brew();
    void boilWatetr(){
        System.out.println("Boiling water");
    }
    void pourInCup(){
        System.out.println("Pouring into cup");
    }
}
