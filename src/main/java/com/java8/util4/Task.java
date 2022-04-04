package com.java8.util4;

import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Callable;

public class Task implements Callable<String> {
    private RestTemplate restTemplate;

    public Task(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String call() throws Exception {

        String url = "http://localhost:8080/home/name/1";
        String response = restTemplate.getForObject(url, String.class);

        return response;
    }
}
