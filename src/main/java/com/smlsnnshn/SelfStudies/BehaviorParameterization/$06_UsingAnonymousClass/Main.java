package com.smlsnnshn.SelfStudies.BehaviorParameterization.$06_UsingAnonymousClass;

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

        //At the moment,
        //when we want to pass new behavior to our filterApples method, we are forced to declare
        //several classes that implement the ApplePredicate interface and then instantiate several
        //ApplePredicate objects that we allocate only once. But, there’s a lot of verbosity involved
        //and it’s a time-consuming process!

        //This is unnecessary overhead; can you do better? Java has a mechanism called anonymous
        //classes, which let you declare and instantiate a class at the same time. They enable you to
        //improve your code one step further by making it a little more concise.

        List<Apple> greenApples = filterApples(appleList, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals("red");
            }
        });

        List<Apple> heavyApples = filterApples(appleList, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 150;
            }
        });

        System.out.println("******* Green Apples ********");
        prettyPrintApple(greenApples, new AppleFancyFormatter());
        System.out.println("******* Heavy Apples ********");
        prettyPrintApple(heavyApples, new AppleSimpleFormatter());

        //But anonymous classes are still not good enough.
        //First, they tend to be very bulky because they take a lot of space.
        //Second, many programmers find them confusing to use.

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

    private static void prettyPrintApple(List<Apple> appleList, AppleFormatter a) {
        for(Apple apple : appleList){
            System.out.println(a.accept(apple));
        }
    }

}


