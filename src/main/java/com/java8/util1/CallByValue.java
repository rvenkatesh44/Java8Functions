package com.java8.util1;

import java.util.HashMap;
import java.util.Map;

public class CallByValue {
    public static void addValue(int i, String str, Person person, Map<String, String> map, StringBuilder sb) {
      // sb = new StringBuilder("NEW STRING BUILDER");
        sb.append(" REGINALD");
        map.put("Key","no_values");
        person.setName("JK");
        i = i+10;
        str = str +"JAVA";
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("G ");
        sb.append("Mathew");
        Map<String,String> map = new HashMap<>();
        map.put("Key","Value");
        Person person = new Person();
        person.setName("JSK");
        int k=10;
        String strng = "JDK_";
        addValue(k,strng,person,map,sb);
        System.out.println(k);
        System.out.println(strng);
        System.out.println(person.getName());
        System.out.println(map);
        System.out.println(sb.toString());
    }

}
