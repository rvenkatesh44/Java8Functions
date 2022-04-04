package com.java8.util3;

import java.io.UncheckedIOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

public class MethodReflection {
    public static void main(String[] args) {
        Class thisClass = Error.class;
        Method[] methods = thisClass.getDeclaredMethods();
        UncheckedIOException uncheckedIOException;
        Arrays.stream(methods)
                .forEach(System.out::println);
    }
}
