package com.java8.util1;

public class Task implements Runnable {
    private int taskId;
    public Task(int i) {
        this.taskId = i;
    }

    @Override
    public void run() {
        System.out.println( " TaskId " + this.taskId + " thread Name " + Thread.currentThread().getName());
    }
}
