package com.smlsnnshn.DeveloperReview.lambda.functional_interfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {

    public static void main(String[] args) {

        //Accepts a single parameter and returns a single value
        Function<Integer,Double> half = a -> a/2.0;
        System.out.println(half.apply(10));

        //Does not accepts any argument and returns an object
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

        //Accepts a single argument and does not return any result
        Consumer<Integer> display = a -> System.out.println(a);
        display.accept(10);

        //Accepts a single argument and returns true or false
        Predicate<Integer> lesserThan = i -> (i<10);
        System.out.println(lesserThan.test(5));

    }

}
