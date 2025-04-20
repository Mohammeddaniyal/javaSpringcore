package com.daniyal.springcore;
public class Car {
        private Engine myEngine;
        private Tyre truck;
        private Glass glass1;
        public void setDaniyal(Engine myEngine)
        {
            this.myEngine=myEngine;
        }
        public void setGlass(Glass glass)
        {
            this.glass1=glass;
        }
        public void setTyre(Tyre tyre1)
        {
            this.truck= tyre1;
        }
    public void drive()
    {
        myEngine.start();
        truck.rotate();
        glass1.move();
        System.out.println("Car is moving....");
    }
}
