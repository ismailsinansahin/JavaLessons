package com.smlsnnshn.DeveloperReview.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class IntermediateOperations {

    public static void main(String[] args) {

        Integer[] numbersArray = {1,2,3,4,5,6,7,8,9,10};
        Stream<Integer> numbersStream = Arrays.stream(numbersArray);

        System.out.println("****************FILTER****************");

        System.out.println(numbersStream.filter(number -> number % 2 != 0).count());

        Stream<String> stringStream = Arrays.asList("Apple", "Orange", "Banana", "Apple", "Mango", "Cherry").stream();
        System.out.println(stringStream.filter(str -> str.length() == 5).count());

        //ERROR
        //stream has already been operated upon or closed - It ended with count()
        //System.out.println(stringStream.filter(str -> str.startsWith("A")).count());

        Arrays.asList("Apple", "Orange", "Banana", "Apple", "Mango", "Cherry")
                .stream().filter(str -> str.equals("Apple")).forEach(str -> System.out.println(str));

        System.out.println("****************MAP****************");

        Arrays.asList("Apple", "Orange", "Banana", "Apple", "Mango", "Cherry")
                .stream().map(str -> str.toUpperCase()).forEach(str -> System.out.println(str));

        System.out.println("****************DISTINCT****************");
        Arrays.asList("Apple", "Orange", "Banana", "Apple", "Mango", "Cherry")
                .stream().distinct().forEach(str -> System.out.println(str));

        System.out.println("****************SORTED ORDER****************");
        Arrays.asList(3,9,5,4,1,6,2,8,7).stream().sorted().forEach(num -> System.out.println(num));

        System.out.println("****************SORTED REVERSE ORDER****************");
        Arrays.asList(3,9,5,4,1,6,2,8,7).stream().sorted(Comparator.reverseOrder())
                .forEach(num -> System.out.println(num));

    }

}
