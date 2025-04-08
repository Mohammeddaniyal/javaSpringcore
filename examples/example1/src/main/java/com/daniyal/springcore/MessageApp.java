package com.daniyal.springcore;

public class MessageApp {
    private MessageService messageService;
/*
Commeting this construtor based injection to understand setter based injection

In case of both injection in a class for same object type
Internally it'll lead to this that 
What Happens Internally:

1)  Spring calls the constructor first → dependency is set 

2) Then Spring calls the setter, which overwrites the same dependency again

❌ No errors or exceptions

❗ But it's inefficient and confusing

✅ Only last injection wins (setter in this case)    

    constructor based injection
    public MessageApp(MessageService messageService)
    {
        this.messageService=messageService;
    }
        */
   
    //setter method to inject method MessageService
    public void setMessageService(MessageService messageService)
    {
        this.messageService=messageService;
    }
    public void printMessage()
    {
        System.out.println(messageService.getMessage());
    }
}
