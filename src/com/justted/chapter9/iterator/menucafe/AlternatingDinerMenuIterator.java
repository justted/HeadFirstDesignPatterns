package com.justted.chapter9.iterator.menucafe;

import java.util.Calendar;
import java.util.Iterator;

/**
 * Created by justted on 2017/4/26.
 */
public class AlternatingDinerMenuIterator implements Iterator{
    MenuItem[] items;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        Calendar rightNow = Calendar.getInstance();
        position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;  //%，取余数的除法，这里就是为了辨别是周几是单数还是双数，position只能为0或1
    }

    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 2;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Alternating Diner Menu Iterator does not support remove()");
    }
}
