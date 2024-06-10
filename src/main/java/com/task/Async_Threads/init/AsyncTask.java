package com.task.Async_Threads.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;


@Component
public class AsyncTask {

        Logger logger = LoggerFactory.getLogger(AsyncTask.class);
        @Async("asyncExecuter")
        public void runTask(int pid){
            logger.info("Async task started with PID: {}",pid);
        }
}
