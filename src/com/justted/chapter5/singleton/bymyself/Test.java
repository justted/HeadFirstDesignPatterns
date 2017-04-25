package com.justted.chapter5.singleton.bymyself;

/**
 * Created by Justted on 2017/4/5.
 */
public class Test {

    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        Single c1 = Single.single;
        a1.Xadd();
        System.out.println(c1.add());

        b1.Yadd();
        System.out.println(c1.add());
    }
}
