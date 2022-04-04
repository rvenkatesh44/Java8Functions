package com.java8.util;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntExample {


    public static void main(String[] args) {
        List<String> list = Arrays.asList("java","100","100","2","java","springboot","microservices");

        list
                .stream()
                .distinct()
                .filter(s -> s.length()>0)
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder());
               // .forEach(System.out::println);

       // list.forEach((a-> System.out.println(a)));
        ArrayList<String> al = new ArrayList<>(Arrays.asList(new String[] {"One","Two","Three","Four"}));
        ArrayList<String> al1 = al.stream().distinct().collect(Collectors.toCollection(ArrayList::new));

        String[] arr = { "12","l",":"};
        //System.out.println(StreamIntExample.findFoo(null));
        Stream<String> strm = Arrays.stream(arr);
            //wstrm
                    al.stream()
                .sorted()
                   //.map(al.remove(1))
                .forEach(a -> System.out.println(a));
                   for(String a: al) {
                       //al.add("1");
                   }
                   al.iterator().remove();
    }
    public static Optional<String> findFoo(String id) {

        return Optional.of(id);
    }


}
