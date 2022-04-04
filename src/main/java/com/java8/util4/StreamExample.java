package com.java8.util4;

import java.util.stream.IntStream;

public class StreamExample {
    public static void main(String[] args)   {
            System.out.println(
                    IntStream.range(0, 100)
                            .parallel()
                            .findFirst()
                            .orElse(-1)
            );

    }
}
