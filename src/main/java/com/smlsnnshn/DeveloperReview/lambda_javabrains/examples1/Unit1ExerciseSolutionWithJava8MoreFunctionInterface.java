package com.smlsnnshn.DeveloperReview.lambda_javabrains.examples1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionWithJava8MoreFunctionInterface {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Carroll",42),
                new Person("Thomas","Carlyle",51),
                new Person("Charlotte","Bronte",45),
                new Person("Matthew","Arnold",39)
        );

        //Step-1 Sort list by last name

        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName())) ;

        //Step-2 Create a method that prints all elements in the list

        System.out.println("Printing all people in Step-2");
        performConditionally(people, p -> true, p -> System.out.println(p));

        //Step-3 Create a method that prints all people that have last name beginning with C

        System.out.println("Printing people whose last names are starting with C with Function Interface");
        performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));
        System.out.println("Printing people whose names are starting with C with Function Interface");
        performConditionally(people, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p));

    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
        for (Person each : people){
            if (predicate.test(each)){
                consumer.accept(each);
            }
        }
    }

}
