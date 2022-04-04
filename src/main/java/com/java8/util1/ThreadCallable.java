package com.java8.util1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> c = () -> Thread.currentThread().getName();
        FutureTask<String> ft = new FutureTask<>(c);
        Thread t =  new Thread(ft,"thread-80");
        t.start();
        System.out.println(ft.get());

    }
}
