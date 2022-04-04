package com.java8.util;

import java.io.FileFilter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        FileFilter fileFilter;
        Vechile vechile = new Car();
        vechile.startEngine();
        int a =992;
        System.out.println(992);
        Map<Student,String> map = new HashMap<>();
        Student student1 = new Student(1L,"John");
        Student student2 = new Student(2L,"Mark");
        Student student3 = new Student(3L,"Test");
        map.put(student1,student1.getName());
        map.put(student2,student2.getName());
        map.put(student3,student3.getName());
        System.out.println(map.get(student1.equals(student1)));

    }

}
