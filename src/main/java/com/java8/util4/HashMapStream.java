package com.java8.util4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapStream {
    public static void main(String[] args) {
         Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("first", 10000);
        map.put("second", 20000);
        map.put("third", 300);
        map.put("fourth", 800012);
        map.put("fifth", 5000);
        map.put("sixth", 30012);
        map.put("seventh", 1234);
        map.put("eighth", 45321);
        map.put("nineth", 5678);


        Collection<Integer> list =  map.values();

        int[] populatedZip = map.entrySet().parallelStream()
                .sorted(Map.Entry.<String, Integer>comparingByValue())
                .limit(5)
                .mapToInt(entry -> entry.getValue())
                .toArray();
       // System.out.println(Arrays.toString(populatedZip));

        List<Integer> listInt = map.values()
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(listInt);
        System.out.println(listInt.indexOf(30012));

        System.out.println(
                listInt.stream()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst()
                        .orElse(1)
        );

        int[] populatedzip=map.values()
                .stream()
                .sorted(Comparator.reverseOrder())
                .limit(5)
                .mapToInt(i->i)
                .toArray();
        System.out.println(
                map.values()
                        .stream()
                        .sorted(Comparator.reverseOrder())
                        .limit(5)

        );
        Spliterator spliterator;




    }
}
