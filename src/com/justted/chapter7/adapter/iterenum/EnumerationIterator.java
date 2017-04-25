package com.justted.chapter7.adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by justted on 2017/4/12.
 */
public class EnumerationIterator implements Iterator {

    Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
