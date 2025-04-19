package com.daniyal.springcore;
public class Car {
        private Engine engine;
        private Tyre tyre;
        private Glass glass;
        public void setEngine(Engine engine)
        {
            this.engine=engine;
        }
        public void setGlass(Glass glass)
        {
            this.glass=glass;
        }
        public void setTyre(Tyre tyre)
        {
            this.tyre= tyre;
        }
    public void drive()
    {
        engine.start();
        tyre.rotate();
        glass.move();
        System.out.println("Car is moving....");
    }
}
