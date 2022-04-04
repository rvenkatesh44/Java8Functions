package com.java8.util;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamLearnings {
    public static void main(String[] args) {
        String java = "OPPO";
        IntStream
                .range(1,14)
                .forEach(System.out::print);
        System.out.println();
        IntStream
                .range(1,14)
                .skip(9)
                .forEach( x -> System.out.print(x));
        System.out.println();
        System.out.println(
                IntStream
                .range(1,19)
                .sum()
        );
        System.out.println();
        Stream.of("Aa","1A","Op")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
        List<String> list  = new ArrayList<>();
        Stream.of("2Aa","1A","Op")
                .map(x -> {
                    x = x.toLowerCase(Locale.ENGLISH);
                    return x;
                })
                 .collect(Collectors.toCollection(()->list));
        System.out.println(Arrays.toString(list.toArray()));

        Map<String, String> map = new HashMap<>();
        map.put("1", "f");
        map.put("2", "I");
        map.put("3", "a");
        map.put("2a", "2a");

        List<String> list1  = new ArrayList<>();
       list1= map.entrySet()
                .stream()
               // .filter(x -> list.contains(x.getKey()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(Arrays.toString(list1.toArray()));

        List<String> list3 = IntStream
                        .range(200,1999)
                        .mapToObj(Integer::toString)
                        .collect(Collectors.toList());

        Map<String,Integer> tmap =  Stream.of(list,list1,list3)
                .flatMap(Collection::stream)
                .collect(Collectors.toMap(c->c,c -> c.length()));
       // System.out.println(tmap);

        Map<String,String> tdmap = IntStream
                                        .range(0,list.size())
                                        .boxed()
                                        .collect(Collectors.toMap(list1::get,list::get));

        System.out.println(tdmap);



    }
}
