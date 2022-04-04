package com.java8.util4;

import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureCls {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TimeoutThreadExample timeoutThreadExample = new TimeoutThreadExample();
        for (int i=0;i<109;i++)
        timeoutThreadExample.getData();



        System.out.println("inside save home com.dailylearning.springbootfundamentals.controller");
    }

    Object call() throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Future future = executor.submit(() -> {
            try {
                String employee =
                        new RestTemplate().getForObject("http://localhost:8080/home/name/1"
                                ,String.class);
                System.out.println(employee);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        future.get();

        return new Object();
    }
}
