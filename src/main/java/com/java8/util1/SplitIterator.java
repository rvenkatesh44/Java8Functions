package com.java8.util1;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SplitIterator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Orange");
        Spliterator<String> s = list.spliterator();
        s.tryAdvance(System.out::println);
        System.out.println(" --- bulk traversal");
        s.forEachRemaining(System.out::println);
        String random = "";
        System.out.println(" --- attempting tryAdvance again");
        boolean b = s.tryAdvance(System.out::println);
        System.out.println("Element exists: "+b);

        list = Arrays.asList("Apple", "Banana", "Orange","a0","a1","b0","b1");

         s = list.spliterator();
        Spliterator<String> s1 = s.trySplit();
        System.out.println("s1 = " + s1.getExactSizeIfKnown());
        System.out.println("s1.estimateSize() = " + s1.estimateSize());
        s.forEachRemaining(System.out::println);
        System.out.println("-- traversing the other half of the spliterator --- ");
        s1.forEachRemaining(System.out::println);
    }
}
