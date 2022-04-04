package com.java8.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamMapFunctions {
    public static List<Person> createPeople () {
        return Arrays.asList(
                new Person("John",GENDER.MALE,32),
                new Person("John",GENDER.MALE,33),
                new Person("Mathew",GENDER.MALE,23),
                new Person("Stacy",GENDER.FEMALE,21),
                new Person("Lisa",GENDER.FEMALE,26),
                new Person("Jane",GENDER.MALE,37),
                new Person("Lisbon",GENDER.FEMALE,34),
                new Person("Lisbon",GENDER.FEMALE,31)

        );
    }

    public static void main(String[] args) {
        List<Person> people = createPeople();
        System.out.println(
                people.stream()
                    .collect(toMap(
                            person -> person.getName() + "-" + person.getAge(),
                            person -> person
                    )));

        System.out.println(
                people.stream()
                      .collect(groupingBy(Person::getName,
                              mapping(Person::getAge,toList())))
        );
    }
}
