package com.task.Async_Threads.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;


@Configuration
@EnableAsync
public class AsyncConfiguration {

    @Bean("asyncExecuter")
    public Executor AsyncTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2); // Initial number of threads
        executor.setMaxPoolSize(4); // Maximum number of threads
        executor.setQueueCapacity(500); // Queue capacity before new threads are created
        executor.setThreadNamePrefix("AsyncTask---"); // Thread name prefix for easier debugging
        executor.initialize(); // Initialize the executor
        return executor;
    }
}
