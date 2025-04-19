package com.daniyal.springcore;
public class Car {
        private Engine engine;
        private Tyre tyre;
        private Glass glass;
        public Car(Engine engine,Tyre tyre,Glass glass)
        {
            this.engine=engine;
            this.tyre=tyre;
            this.glass=glass;
        }
    
    public void drive()
    {
        engine.start();
        tyre.rotate();
        glass.move();
        System.out.println("Car is moving....");
    }
}
