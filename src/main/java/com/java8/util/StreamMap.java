package com.java8.util;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        List<String> listStr = Arrays.asList("s1:string1","s3:string3","s2:string2");
        Map<String,String> map  =
                listStr.stream()
                .map(s -> s.split(":"))
                .collect(Collectors.toMap(a->a[0],a->a[1]));


        Optional<String[]> map1  =
                listStr.stream()
                        .map(s -> s.split(":"))
                         .reduce((a,a1) -> a);
        System.out.println(map +" --> "+ map1);
    }
}
