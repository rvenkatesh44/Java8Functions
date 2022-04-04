package com.java8.util;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringExample {
    public static void main(String[] args) {
        String[] stringArray = { "Barbara", "James", "Mary", "John",
                "Patricia", "Robert", "Michael", "Linda", "George" };
        Arrays.sort(stringArray, String::compareToIgnoreCase);

        String s = stringArray[0];
      //  System.out.println( s.compareToIgnoreCase("barbar1"));
        //System.out.println(Arrays.toString().to);
        Arrays.stream(stringArray);
                /*.filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()*/
              //.forEach(System.out::println);
       StringExample.checkBinary(1000111110);

        String num="1000111";
       // System.out.println(num.matches("[01]+"));

    }

    public static   String checkBinary(int Num) {
//        String str = String.valueOf(Num);
        boolean binaryFlag = true;
//        for(String s:str.split("")){
//            System.out.println(s);
//            if(s.contains("0") || s.contains("1")) {
//                binaryFlag=true;
//            }else {
//                binaryFlag=false;
//                break;
//            }
//        }
        System.out.println(
                Arrays.stream(String.valueOf(Num).split(""))
                        //.*filter(i -> !(i.equals("0") || i.equals("1")))
                        //.count()
                        .allMatch(i -> (i.equals("0") || i.equals("1")))
        );

      //  System.out.println(binaryFlag);
        return "";
    }
}
