package com.justted.chapter7.adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by justted on 2017/4/13.
 */
public class IteratorEnumeration implements Enumeration {
    Iterator iterator;

    public IteratorEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
