package com.daniyal.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Engine
{
    private String type;
    @Autowired
    public Engine(String type)
    {
        this.type=type;
    }
    public void start()
    {
        System.out.println("Engine started : "+this.type);
    }
}