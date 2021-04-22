package com.smlsnnshn.DeveloperReview;

import com.smlsnnshn.DeveloperReview.lambda_javabrains.examples1.Person;

import java.util.Arrays;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

//        Stream<Person> stream = people.stream();

        people.stream()
                .forEach(p -> System.out.println(p.getFirstName()));

        people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .forEach(p -> System.out.println(p.getFirstName()));

        long count = people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .count();

        System.out.println(count);


    }

}
