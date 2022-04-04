package com.java8.util;

import java.util.stream.Stream;

public class InfiniteStream {
    public static int compute(int k, int n){
        /*int result = 0;
        int index = k;
        int count = 0;
        while (count < n) {
            if(index % 2 == 0 && Math.sqrt(index) > 20) {
                result += index * 2;
                count++;

            }
            index++;
        }

        return result;*/
        return Stream.iterate(k,e -> e +1)
                .filter(e -> e % 2 == 0)
                .filter(e -> Math.sqrt(e) > 20)
                .mapToInt(e -> e * 2)
                .limit(n)
                .sum();
    }
    public static void main(String[] args) {
        /*System.out.println(
                Stream.iterate(100,e -> e + 1)
        );*/

        int k = 121;
        int n = 51;
        System.out.println(compute(k,n));

    }
}
