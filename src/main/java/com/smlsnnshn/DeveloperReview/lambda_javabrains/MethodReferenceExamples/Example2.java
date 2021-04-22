package com.smlsnnshn.DeveloperReview.lambda_javabrains.MethodReferenceExamples;

import com.smlsnnshn.DeveloperReview.lambda_javabrains.examples1.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Example2 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        System.out.println("Printing all people in Step-2");
        performConditionally(people, p -> true, System.out::println); // p -> method(p)

    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
        for (Person each : people){
            if (predicate.test(each)){
                consumer.accept(each);
            }
        }
    }

}
