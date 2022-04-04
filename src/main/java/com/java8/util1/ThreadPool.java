package com.java8.util1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for(int i = 0; i<100; i++) {
            service.submit(new Task(i));
            //System.out.println(i);
        }
        service.shutdown();
    }
}
