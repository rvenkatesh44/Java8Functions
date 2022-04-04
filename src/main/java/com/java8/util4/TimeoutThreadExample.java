package com.java8.util4;

import org.springframework.web.client.RestTemplate;

import java.util.concurrent.*;

public class TimeoutThreadExample {
    private ExecutorService executor = Executors.newFixedThreadPool(10);
    private RestTemplate restTemplate = new RestTemplate();

    public String getData() {
        Future<String> future = executor.submit(new Task(restTemplate));
        String response = null;

        try {
            response = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        return response;
    }
}
