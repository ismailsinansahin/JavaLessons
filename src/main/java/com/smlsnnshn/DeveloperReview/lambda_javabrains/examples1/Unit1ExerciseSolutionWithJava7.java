package com.smlsnnshn.DeveloperReview.lambda_javabrains.examples1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionWithJava7 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Carroll",42),
                new Person("Thomas","Carlyle",51),
                new Person("Charlotte","Bronte",45),
                new Person("Matthew","Arnold",39)
        );

        //Step-1 Sort list by last name

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getLastName().compareTo(p2.getLastName());
            }
        });

        //Step-2 Create a method that prints all elements in the list

        System.out.println("Printing all people in Step-2");
        printAll(people);

        //Step-3 Create a method that prints all people that have last name beginning with C

        System.out.println("Printing people whose last names are starting with C with my way");
        printLastNameBeginingWithC(people); //This is what I know

        System.out.println("Printing people whose last names are starting with C with anonymous class way");
        printConditionally(people, new Condition() { //This is anonymous class implementation way
            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("C");
            }
        });

        System.out.println("Printing people whose names are starting with C with anonymous class way");
        printConditionally(people, new Condition() { //This is anonymous class implementation way
            @Override
            public boolean test(Person person) {
                return person.getFirstName().startsWith("C");
            }
        });

    }

    private static void printLastNameBeginingWithC(List<Person> people) { //This is what I know
        for (Person each : people){
            if (each.getLastName().startsWith("C")) System.out.println(each);
        }
    }

    private static void printConditionally(List<Person> people, Condition condition){
        for (Person each : people){
            if (condition.test(each)){
                System.out.println(each);
            }
        }
    }

    private static void printAll(List<Person> people) {
        for (Person each : people){
            System.out.println(each);
        }
    }

    interface Condition{
        boolean test(Person person);
    }

}

