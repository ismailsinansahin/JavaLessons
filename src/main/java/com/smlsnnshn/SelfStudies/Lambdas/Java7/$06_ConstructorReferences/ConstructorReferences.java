package com.smlsnnshn.SelfStudies.Lambdas.Java7.$06_ConstructorReferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferences {

    public static void main(String[] args) {

        //You can create a reference to an existing constructor using its name and the keyword new as
        //follows: ClassName::new. It works similarly to a reference to a static method. For example,
        //suppose there’s a zero-argument constructor. This fits the signature () -> Apple of Supplier; you
        //can do the following,

        Supplier<Apple> appleSupplier = Apple::new;
        Apple apple1 = appleSupplier.get();

        //Line 16 is equivalent to
        //Supplier<Apple> appleSupplier = () -> new Apple();
        //Apple apple1 = appleSupplier.get();

        //If you have a constructor with signature Apple(Integer weight), it fits the signature of the
        //Function interface, so you can do this,

        Function<Integer, Apple> appleFunction = Apple::new;
        Apple apple2 = appleFunction.apply(110);

        //which is equivalent to
        //Function<Integer, Apple> appleFunction = (weight) -> new Apple(weight);
        //Apple apple2 = appleFunction.apply(110);

        //In the following code, each element of a List of Integers is passed to the constructor of Apple
        //using a similar map method we defined earlier, resulting in a List of apples with different
        //weights:

        List<Integer> weights = Arrays.asList(150,140,110,190);
        List<Apple> appleList = map(weights, Apple::new);

        //If you have a two-argument constructor, Apple(String color, Integer weight), it fits the signature
        //of the BiFunction interface, so you can do this,

        BiFunction<String, Integer, Apple> biFunction = Apple::new;
        Apple apple3 = biFunction.apply("green",160);

    }

    public static List<Apple> map(List<Integer> integerList, Function<Integer, Apple> appleFunction){
        List<Apple> result = new ArrayList<>();
        for(Integer each : integerList){
            result.add(appleFunction.apply(each));
        }
        return result;
    }

}
