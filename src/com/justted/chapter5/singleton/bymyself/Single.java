package com.justted.chapter5.singleton.bymyself;

/**
 * 类似于饿汉式，但是实例化的变量是公开的，最好还是用私有的吧
 * Created by Justted on 2017/4/5.
 */
public class Single {
    public static Single single = new Single();

    private Single() {
    }

    int x = 1;
    int add(){
        x++;
        return x;
    }
}
