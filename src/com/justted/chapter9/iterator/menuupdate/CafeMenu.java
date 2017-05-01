package com.justted.chapter9.iterator.menuupdate;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by justted on 2017/4/26.
 */


public class CafeMenu implements Menu {
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99);
        addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);
        addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }

    public String getName(){
        return "CAFE MENU";
    }

    @Override
    public String getDescription() {
        return "DINNER";
    }
}

