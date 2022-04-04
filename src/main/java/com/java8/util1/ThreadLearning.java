package com.java8.util1;

import java.util.concurrent.Callable;

public class ThreadLearning  implements Callable<String> {


    public static void main(String[] args) {
        Runnable runnable = () -> {
            String name = Thread.currentThread().getName();
            System.out.println(name + " running");
        };
//        ThreadA thread = new ThreadA();
//        new Thread(thread).run();
//
//        ThreadB threadB = new ThreadB(thread);
//        new Thread(threadB).start();
        Thread thread = new Thread(runnable,"thread 1");
        Thread thread2= new Thread(runnable,"thread 2");
        thread.start();
        thread2.start();
    }


    @Override
    public String call() throws Exception {
        return null;
    }
}
