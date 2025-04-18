package com.daniyal.springcore;
public class Car {
    @AutoWired
    private Engine engine;
    public void drive()
    {
        engine.start();
        System.out.println("Car is moving....");
    }
}
