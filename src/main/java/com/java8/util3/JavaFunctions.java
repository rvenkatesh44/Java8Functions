package com.java8.util3;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class JavaFunctions {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> composite = (a,b)->(a*a);

        composite = composite.andThen(a -> a*10);
        System.out.println("args = " + composite.apply(1,2));
    }
}
