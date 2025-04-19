package com.daniyal.springcore;
public class Car {
        private Engine engine;
        private Tyre tyre;
        private Glass glass;
        public Car(Engine engine)
        {
            this.engine=engine;
        }
    public void drive()
    {
        engine.start();
        tyre.rotate();
        System.out.println("Car is moving....");
    }
}
