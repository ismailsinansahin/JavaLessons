package com.smlsnnshn.SelfStudies.BehaviorParameterization.$07_UsingLambda;

import java.util.ArrayList;
import java.util.List;

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

        //We have to admit this code looks a lot cleaner than our previous attempts!

        List<Apple> greenApples = filterApples(appleList, (Apple apple) -> apple.getColor().equals("red"));
        List<Apple> heavyApples = filterApples(appleList, (Apple apple) -> apple.getWeight() > 150);

        System.out.println("******* Green Apples ********");
        prettyPrintApple(greenApples, new AppleFancyFormatter());
        System.out.println("******* Heavy Apples ********");
        prettyPrintApple(heavyApples, new AppleSimpleFormatter());

        //But anonymous classes are still not good enough.
        //First, they tend to be very bulky because they take a lot of space.
        //Second, many programmers find them confusing to use.

    }



    private static void prettyPrintApple(List<Apple> appleList, AppleFormatter a) {
        for(Apple apple : appleList){
            System.out.println(a.accept(apple));
        }
    }

    public static List<Apple> filterApples(List<Apple> appleList, ApplePredicate p){
        List<Apple> filteredApplesList = new ArrayList<>();
        for (Apple apple : appleList){
            if(p.test(apple)){
                filteredApplesList.add(apple);
            }
        }
        return filteredApplesList;
    }

}


