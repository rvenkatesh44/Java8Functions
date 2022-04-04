package com.java8.util;

public class Person {
    private  GENDER GENDER;

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, com.java8.util.GENDER gender, int age ) {
        GENDER = gender;
        this.name = name;
        this.age = age;
    }
}
