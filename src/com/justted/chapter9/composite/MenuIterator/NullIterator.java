package com.justted.chapter9.composite.MenuIterator;

import java.util.Iterator;

/**
 * Created by justted on 2017/4/30.
 */
public class NullIterator implements Iterator {

    @Override
    public Object next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
