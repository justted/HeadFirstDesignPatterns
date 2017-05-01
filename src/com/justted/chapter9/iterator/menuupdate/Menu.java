package com.justted.chapter9.iterator.menuupdate;

import java.util.Iterator;

/**
 * Created by justted on 2017/4/26.
 */
public interface Menu {
    Iterator createIterator();
    String getName();
    String getDescription();
}
