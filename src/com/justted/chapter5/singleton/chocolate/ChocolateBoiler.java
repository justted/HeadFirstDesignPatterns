package com.justted.chapter5.singleton.chocolate;

/**
 * Created by justted on 2017/4/8.
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;

    public static ChocolateBoiler getInstance(){
        if (uniqueInstance == null){
            System.out.println("Creating unique instance of Chocolate Boiler");
            uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return uniqueInstance;
    }

    public void fill(){
        if (isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if (!isEmpty()&&isBoiled()){ //&&为短路与，只要前面的条件不满足，就不用判断后面的条件了
            empty = true;
        }
    }

    public void boil(){
        if (!isEmpty()&&!isBoiled()){
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}
