package com.smlsnnshn.SelfStudies.BehaviorParameterization.$08.AbstractingOverListType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        //We are creating list of Apples here

        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(160,"red"));
        appleList.add(new Apple(150,"red"));
        appleList.add(new Apple(140,"green"));
        appleList.add(new Apple(130,"red"));
        appleList.add(new Apple(120,"green"));
        appleList.add(new Apple(110,"red"));

        System.out.println("******* All Apples ********");
        prettyPrintApple(appleList, new AppleSimpleFormatter());

        List<Apple> greenApples = filter(appleList, (Apple apple) -> apple.getColor().equals("red"));
        List<Apple> heavyApples = filter(appleList, (Apple apple) -> apple.getWeight() > 150);

        System.out.println("******* Green Apples ********");
        prettyPrintApple(greenApples, new AppleFancyFormatter());
        System.out.println("******* Heavy Apples ********");
        prettyPrintApple(heavyApples, new AppleSimpleFormatter());

        //There’s one more step that you can do in your journey toward abstraction.
        //At the moment, the filterApples method works only for Apple.
        //But you can also abstract on the List type to go
        //beyond the problem domain you’re thinking of right now.

        //You can now use the method filter with a List of bananas, oranges, Integers, or Strings!
        //Here’s an example, using lambda expressions:

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> evenNumbers = filter(numbers, (Integer i) -> i % 2 == 0);
        System.out.println("******* Even Numbers ********");
        System.out.println("evenNumbers = " + evenNumbers.toString());;

    }

    private static void prettyPrintApple(List<Apple> appleList, AppleFormatter a) {
        for(Apple apple : appleList){
            System.out.println(a.accept(apple));
        }
    }

    public static <T >List<T> filter(List<T> list, Predicate<T> p){
        List<T> filteredList = new ArrayList<>();
        for (T each : list){
            if(p.test(each)){
                filteredList.add(each);
            }
        }
        return filteredList;
    }

}


