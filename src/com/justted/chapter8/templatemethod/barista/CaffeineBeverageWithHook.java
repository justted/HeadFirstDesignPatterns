package com.justted.chapter8.templatemethod.barista;

/**
 * Created by justted on 2017/4/20.
 */
public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe(){
        boilWatetr();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    abstract void addCondiments();
    abstract void brew();
    void boilWatetr(){
        System.out.println("Boiling water");
    }
    void pourInCup(){
        System.out.println("Pouring into cup");
    }
    boolean customerWantsCondiments(){
        return true;
    }
}
