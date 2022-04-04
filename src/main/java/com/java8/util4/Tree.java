package com.java8.util4;

public interface Tree {
    boolean climb(int h, int t);
    default void display(int a) {
        System.out.println("a = " + a);
    }
}
