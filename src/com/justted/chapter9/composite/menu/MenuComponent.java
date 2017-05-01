package com.justted.chapter9.composite.menu;

/**
 * Created by justted on 2017/4/29.
 */
public abstract class MenuComponent {

    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }  //增加菜单组件

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }  //删除菜单组件

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }   //取得菜单组件

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public double getPrice(){
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }

}
