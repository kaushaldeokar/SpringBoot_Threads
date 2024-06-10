package com.task.Async_Threads.init;

import org.springframework.stereotype.Component;

@Component
public class MyThreads extends Thread {

    @Override
    public void run(){
        System.out.println("MyThreads1 is running........");
    }

}
