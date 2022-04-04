package com.java8.util;

import java.util.Arrays;
import java.util.List;

public class LambaEfffeciency {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        int result = 0;
        for(int number:numbers) {
            if(number > 3 && number % 2 ==0 ){
                result += number * 2;
                break;
            }
        }
      //  System.out.println(result);

        System.out.println(
                numbers.stream()
                       .filter(LambaEfffeciency::isGT3)
                       .filter(LambaEfffeciency::isEven)
                       .map(LambaEfffeciency::doubleIt)
                       .findFirst()

        );
    }

    private static Integer doubleIt(Integer integer) {
        System.out.println(" doubleIt " + integer);
        return integer * 2;
    }

    public static boolean isGT3(int number) {
        System.out.println(" isGT3 " + number);
        return number > 3;
    }
    public static boolean isEven(int number) {
        System.out.println(" isEven " + number);
        return number % 2 == 0;
    }



}
