package com.daniyal.springcore;

public class MessageApp {
    private MessageService messageService;

    //constructor based injection
    public MessageApp(MessageService messageService)
    {
        this.messageService=messageService;
    }
    public void printMessage()
    {
        System.out.println(messageService.getMessage());
    }
}
