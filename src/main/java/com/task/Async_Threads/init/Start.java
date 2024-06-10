package com.task.Async_Threads.init;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Start {

    @Autowired
    AsyncTask asyncTask;

    //runs at initialization of beans
    @PostConstruct
    public void init() {

        for(int i=1;i<=100;i++){
            asyncTask.runTask(i);
        }

    }
}
