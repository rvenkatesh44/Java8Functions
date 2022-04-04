package com.java8.util3;

public interface interface2 {
    default void printMain() {
        System.out.println("interface2.printMain");
    }

    static void printStaticMain() {
        System.out.println("interface2.printStaticMain");
    }
}
