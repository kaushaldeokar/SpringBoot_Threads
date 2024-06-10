package com.task.Async_Threads;

import com.task.Async_Threads.init.MyThreads;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AsyncThreadsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsyncThreadsApplication.class, args);


		MyThreads t1 = new MyThreads();
		// this will call run() method
		// we can call this also by loop and create 100 threads //
		t1.start();

	}

}
