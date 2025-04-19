package com.daniyal.springcore;

public class Engine
{
    private String type;
    public Engine(String type)
    {
        this.type=type;
    }
    public void start()
    {
        System.out.println("Engine started : "+this.type);
    }
}