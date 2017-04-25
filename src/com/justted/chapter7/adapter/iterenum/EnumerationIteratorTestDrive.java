package com.justted.chapter7.adapter.iterenum;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by justted on 2017/4/12.
 */
public class EnumerationIteratorTestDrive {
    public static void main(String[] args) {
        Vector v = new Vector(Arrays.asList(args));  //Java中Arrays的asList()方法 可以将 数组转为List 但是，这个数组类型必须是引用类型的，如果是8中基本数据类型就不可以
        Iterator iterator = new EnumerationIterator(v.elements());  //这里需要传参，而vector的elements方法正是返回此向量的组件的枚举
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
