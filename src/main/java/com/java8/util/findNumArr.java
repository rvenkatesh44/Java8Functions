package com.java8.util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findNumArr {


    public static void main(String[] args) {
        Function<String,String> func  =
               (value) -> value.toUpperCase();

        System.out.println( func.apply("same") );

        int[] numbers = new int[10];
        numbers[0] = 101;
        numbers[1] = -34200;
        numbers[2] = 3040;
        numbers[3] = 400433;
        numbers[4] = 500;
        numbers[5] = -100;
        numbers[6] = -200;
        numbers[7] = 532;
        numbers[8] = 6584;
        numbers[9] = -945;

        int myNumber = 400432;
        int distance = Math.abs(numbers[0] - myNumber);
        System.out.println(" distance " + distance);
        int idx = 0;
        for(int c = 1; c < numbers.length; c++){
            int cdistance = Math.abs(numbers[c] - myNumber);
            if(cdistance < distance){
                System.out.println(" cdistance " +cdistance);
                System.out.println(" distance " + distance);
                idx = c;
                distance = cdistance;
            }
        }
        int theNumber = numbers[idx];
        System.out.println(theNumber);

        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        int n = myNumber;

        int c = list.stream()
                .min(Comparator.comparingInt(i -> Math.abs(i - n)))
                .orElseThrow(() -> new NoSuchElementException("No value present"));

        System.out.println(c);


    }
}
