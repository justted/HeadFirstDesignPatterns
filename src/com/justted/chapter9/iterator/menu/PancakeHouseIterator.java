package com.justted.chapter9.iterator.menu;

import java.util.ArrayList;

/**
 * Created by justted on 2017/4/26.
 */
public class PancakeHouseIterator implements Iterator {
    ArrayList items;
    int position = 0;

    public PancakeHouseIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public Object next() {
        Object object = items.get(position);
        position = position + 1;
        return object;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size()){   //一开始这里这个等号忘打了，悲剧
            return false;
        }else {
            return true;
        }
    }
}
