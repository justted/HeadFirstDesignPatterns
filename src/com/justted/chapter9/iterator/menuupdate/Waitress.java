package com.justted.chapter9.iterator.menuupdate;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by justted on 2017/4/26.
 */
public class Waitress {
    ArrayList menus;

    public Waitress(ArrayList menus) {
        this.menus = menus;
    }

    public void printMenu(){
        Iterator menuIterator = menus.iterator();
        while (menuIterator.hasNext()){
            Menu menu = (Menu)menuIterator.next();
            System.out.println(menu.getName());
            System.out.println("------------------------");
            System.out.println(menu.getDescription());
            printMenu(menu.createIterator());
            System.out.println(" ");
        }
    }

    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printVegetarianMenu(){
        Iterator menuIterator = menus.iterator();
        while (menuIterator.hasNext()){
            Menu menu = (Menu)menuIterator.next();
            System.out.println(menu.getName());
            System.out.println("------------------------");
            System.out.println(menu.getDescription());
            printVegetarianMenu(menu.createIterator());
            System.out.println(" ");
        }
    }

    public boolean isItemVegetarian(String name){
        Iterator menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = (Menu) menuIterator.next();
            if (isVegetarian(name, menu.createIterator())) {
                return true;    //对于需要返回值的方法，可以在if语句中返回，但是外面也必须有return语句
            }
        }
        return false;
    }

    private void printVegetarianMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            if (menuItem.isVegetarian()){
                System.out.print(menuItem.getName());
                System.out.print("\t\t" + menuItem.getPrice());  //\t代表tab，也即8个空格
                System.out.println("\t" + menuItem.getDescription());
            }
        }
    }

    private boolean isVegetarian(String name, Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            if (menuItem.getName().equals(name)){
                if (menuItem.isVegetarian()){
                    return true;
                }
            }
        }
        return false;
    }
}
