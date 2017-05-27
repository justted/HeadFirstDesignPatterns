package com.justted.chapter12.combining.factory;

/**
 * Created by justted on 2017/5/20.
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory){
        Quackable mallardDuck = duckFactory.creatMallardDuck();
        Quackable redheadDuck = duckFactory.creatRedheadDuck();
        Quackable duckCall = duckFactory.creatDuckCall();
        Quackable rubberDuck = duckFactory.creatRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator: With Abstract Factory");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
