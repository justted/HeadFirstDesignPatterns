package com.justted.chapter9.iterator.menuupdate;

import java.util.ArrayList;

/**
 * Created by justted on 2017/4/26.
 */
public class MenuTestDrive {
    public static void main(String[] args){
        ArrayList menus = new ArrayList();  //没使用泛型的话，取出来的元素都是object类型，必须强制转换，而泛型则不是
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        menus.add(cafeMenu);

        Waitress waitress = new Waitress(menus);

        waitress.printMenu();

        waitress.printVegetarianMenu();

        System.out.println("\nCustomer asks, is the Hotdog vegetarian?");
        System.out.print("Waitress says: ");
        if (waitress.isItemVegetarian("Hotdog")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println("\nCustomer asks, are the Waffles vegetarian?");
        System.out.print("Waitress says: ");
        if (waitress.isItemVegetarian("Waffles")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
