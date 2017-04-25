package com.justted.chapter5.singleton.chocolate;

/**
 * Created by justted on 2017/4/8.
 */
public class ChocolateController {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
    }
}
