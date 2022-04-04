package com.java8.util1;

public class ThreadB implements Runnable {
    private ThreadA threadA;


    @Override
    public void run() {
        threadA.setSomething();
        System.out.println("Inside Run ThreadB");
    }

    public ThreadB(ThreadA threadA) {
        this.threadA = threadA;
    }


}
