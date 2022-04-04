package com.java8.util1;

import java.util.Scanner;

public class ProducerConsumer {
    public void produce() throws InterruptedException {

        synchronized (this) {
            System.out.println("producer is running ****** ");
            wait();
            System.out.println(" produce Resumed ");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(1000);
        Scanner scanner = new Scanner(System.in);
        synchronized (this) {
            System.out.println("Waiting for key press");
            scanner.nextLine();
            System.out.println("Key Pressed");
            notify();
            Thread.sleep(2000);
        }
    }
}
