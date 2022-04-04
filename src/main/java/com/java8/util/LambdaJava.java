package com.java8.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import static java.util.stream.Collectors.*;

import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class LambdaJava {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Another THread");
            List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
            list.forEach(System.out::println);
            System.out.println(
                    list.stream()
                    .reduce(Integer::sum).get()
            );

            System.out.println(
                    list.stream()
                        .map(String::valueOf)
                    .reduce(String::concat).get()
            );

            int result =0;
            for (int i:list) {
                if(i % 2 ==0) {
                    result+=i *2;
                }
            }
            System.out.println(result);
            Predicate<Integer> predicate = (p)-> p % 2 == 0 ;
            System.out.println(
            list.stream()
                    .filter(predicate)
                    .mapToInt( e -> e * 2)
                    .sum()
            );

            System.out.println(
                    list.stream()
                            .filter(predicate)
                            .map( e -> e * 2.045)
                            .reduce(Double::sum)
            );

            DoubleStream ds;

            List<Integer> numbers = Arrays.asList(1,2,3,4,5,1,2,3,4,5);

            List<Double> doubleEven = new ArrayList<>();

            numbers.stream()
                   .filter(e -> e % 2 == 0)
                   .map( e -> e * 2.0)
                    .forEach(e -> doubleEven.add(e));

            Set<Integer> doubleEvenSet =
                    numbers.stream()
                    .filter(e -> e % 2 == 0)
                    .map(e -> e * 2)
                    .collect(toSet());
            System.out.println(doubleEvenSet);




        });
       /* thread = new Thread(() -> System.out.println("Another THread"));
        thread = new Thread(() -> System.out.println("Another THread"));
        thread = new Thread(() -> System.out.println("Another THread"));
        thread = new Thread(() -> System.out.println("Another THread"));
        thread = new Thread(() -> System.out.println("Another THread"));*/
        thread.start();
        System.out.println("In Main method");


    }
}
