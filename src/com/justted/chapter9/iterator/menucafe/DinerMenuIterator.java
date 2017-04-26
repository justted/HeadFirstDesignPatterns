package com.justted.chapter9.iterator.menucafe;


import java.util.Iterator;

/**
 * Created by justted on 2017/4/26.
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public void remove() {
        if (position <= 0){
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if (items[position-1] != null){
            for (int i = position-1; i < (items.length -1); i++) {
                items[i] = items[i+1];
            }
            items[items.length-1] = null;
        }
    }
}
