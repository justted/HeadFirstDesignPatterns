package com.justted.chapter9.iterator.menumerger;

/**
 * Created by justted on 2017/4/26.
 */
public class DinerMenuIterator implements Iterator{
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
}
