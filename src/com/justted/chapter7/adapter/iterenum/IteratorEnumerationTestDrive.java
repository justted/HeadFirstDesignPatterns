package com.justted.chapter7.adapter.iterenum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * Created by justted on 2017/4/13.
 */
public class IteratorEnumerationTestDrive {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(Arrays.asList(args));
        Enumeration enumeration = new IteratorEnumeration(list.iterator());
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
