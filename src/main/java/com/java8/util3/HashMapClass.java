package com.java8.util3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapClass {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.keySet();
        ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("A1","a1");
        String result = concurrentHashMap.search(1,(k,v)->{

            return k.toLowerCase()+v.toLowerCase();
        });
        System.out.println("result = " + result);

    }
}
