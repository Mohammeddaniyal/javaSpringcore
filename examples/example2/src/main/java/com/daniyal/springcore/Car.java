package com.daniyal.springcore;
public class Car {
        private Engine engine;
        private Tyre tyre;
        private Glass glass;
        public Car(Engine engine)
        {
            this.engine=engine;
        }
        public void setTyre(Tyre tyre)
        {
            this.tyre=tyre;
        }
        public void setGlass(Glass glass)
        {
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
