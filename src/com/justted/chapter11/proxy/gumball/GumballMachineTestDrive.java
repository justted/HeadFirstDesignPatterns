package com.justted.chapter11.proxy.gumball;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 * Created by justted on 2017/5/1.
 */
public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachine gumballMachine = null;  //一开始这里还多用了一个GumballMachineRemote的实例，却发现他们不能共享静态全局变量
        int count;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {     //在需要实例化糖果机的代码周围加上try/catch块
            count = Integer.parseInt(args[1]);
            LocateRegistry.createRegistry(1099);
            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("rmi://localhost:1099/A", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
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


