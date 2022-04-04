package com.java8.util3;
@FunctionalInterface
public interface interface1 {
    void calcDimensity();
    default void printMain() {
        System.out.println("interface1.printMain");
    }

    static void printStaticMain(){
        System.out.println("interface1.printStaticMain");
    }
}
