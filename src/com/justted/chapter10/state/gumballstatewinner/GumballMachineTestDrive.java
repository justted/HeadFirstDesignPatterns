package com.justted.chapter10.state.gumballstatewinner;

/**
 * Created by justted on 2017/5/1.
 */
public class GumballMachineTestDrive {

    public static void main(String[] args){
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}

