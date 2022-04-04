package com.java8.util4;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> emailList = new ArrayList<>();
        Map<String,Integer> dmap = new HashMap<>();
        dmap.put("c91@comp1.com",198);
        dmap.put("c93@comp1.com",191);
        dmap.put("c97@comp1.com",181);

        emailList.add("c91@comp1.com");
        emailList.add("c95@comp1.com");
        emailList.add("c97@comp1.com");
        for(String str:emailList) {
            if(!dmap.containsKey(str)) {
                dmap.put(str,Collections.max(dmap.values())+1);
            }
        }

        for (String str:dmap.keySet()){
            if(!emailList.contains(str)) {
                emailList.add(str);
            }
        }

        for(int i=0;i<emailList.size();i++) {
            String listItem = emailList.get(i);
            if( dmap.containsKey(listItem)){
                emailList.set(i,String.valueOf(dmap.get(listItem)));
            }
        }
        System.out.println(emailList);
        System.out.println(dmap);

        Map<String, Integer>
                tsmap = Collections
                .checkedMap(dmap,
                        String.class,
                        Integer.class);
        tsmap.put("a",1);
        System.out.println(tsmap);

    }
}
