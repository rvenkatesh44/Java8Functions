package com.java8.util1;

public class ThreadA implements Runnable {

    @Override
    public void run() {
        System.out.println("Inside thread A");
    }

    public void setSomething() {
        System.out.println("inside setsomething");
    }
}
