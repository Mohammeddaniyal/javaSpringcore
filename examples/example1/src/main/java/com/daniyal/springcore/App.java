package com.daniyal.springcore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
    public static void main(String []args)
    [
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");

        MessageApp messageApp=context.getBean("messageApp",MessageApp.class);
        messageApp.printMessage();
    ]
}
