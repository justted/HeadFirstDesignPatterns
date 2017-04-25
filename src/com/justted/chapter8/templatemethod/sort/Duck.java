package com.justted.chapter8.templatemethod.sort;

/**
 * Created by justted on 2017/4/21.
 */
public class Duck implements Comparable {
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name +  " weights " + weight;
    }

    public int compareTo(Object object){
        Duck otherDuck = (Duck)object;

        if (this.weight < otherDuck.weight){
            return -1;
        }else if (this.weight == otherDuck.weight){
            return 0;
        }else {//this.weight > otherDuck.weight
            return 1;
        }
    }
}
