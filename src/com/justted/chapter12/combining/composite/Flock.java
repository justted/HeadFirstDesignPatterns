package com.justted.chapter12.combining.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by justted on 2017/5/22.
 */
public class Flock implements Quackable {    // 组合模式
    ArrayList quackers = new ArrayList();
    public void add(Quackable quacker){
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()){    //这里也用到了迭代器模式
            Quackable quacker = (Quackable)iterator.next();
            quacker.quack();
        }
    }
}
