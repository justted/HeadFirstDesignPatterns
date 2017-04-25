package com.justted.chapter7.adapter.iterenum;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * 示例一下经典的枚举于迭代器的用法
 * Created by justted on 2017/4/13.
 */
public class EI {
    public static void main (String args[]) {
        Vector v = new Vector(Arrays.asList(args));
        Enumeration enumeration = v.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        Iterator iterator = v.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

