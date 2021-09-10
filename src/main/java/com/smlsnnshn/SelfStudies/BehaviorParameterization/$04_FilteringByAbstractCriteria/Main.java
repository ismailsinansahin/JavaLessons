package com.smlsnnshn.SelfStudies.BehaviorParameterization.$04_FilteringByAbstractCriteria;

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
        printAppleList(appleList);

        //One possible solution is to model our selection criteria:
        //we are working with apples and returning a boolean based on some attributes of Apple
        //(for example, is it green? is it heavier than 150 g?).
        //We call this a predicate (that is, a function that returns a boolean).

        //But how can you make use of the different implementations of ApplePredicate?
        //You need your filterApples method to accept ApplePredicate objects to test a
        //condition on an Apple. This is what behavior parameterization means:
        //the ability to tell a method to take multiple behaviors (or strategies)
        //as parameters and use them internally to accomplish different behaviors.

        List<Apple> greenApples = filterApples(appleList, new AppleGreenColorPredicate());
        List<Apple> heavyApples = filterApples(appleList, new AppleHeavyWeightPredicate());
        System.out.println("******* Green Apples ********");
        printAppleList(greenApples);
        System.out.println("******* Heavy Apples ********");
        printAppleList(heavyApples);

        //It’s worth pausing for a moment for a small celebration.
        //This code is much more flexible than our first attempt,
        //while at the same time it’s easy to read and to use! You can now create
        //different ApplePredicate objects and pass them to the filterApples method.
        //Free flexibility! For example, if the farmer asks you to find all red apples
        //that are heavier than 150 g, all you need to do is create a class
        //that implements the ApplePredicate accordingly. Your code is now flexible
        //enough for any change of requirements involving the attributes of Apple:

        List<Apple> redAndHeavyApples = filterApples(appleList, new AppleRedAndHeavyWeightPredicate());
        System.out.println("******* Red And Heavy Apples ********");
        printAppleList(redAndHeavyApples);

        //Now we have parameterized the behavior of the filterApples method.

    }

    //Our ugly attempt of merging all attributes appears as follows

    public static List<Apple> filterApples(List<Apple> appleList, ApplePredicate p){
        List<Apple> filteredApplesList = new ArrayList<>();
        for (Apple apple : appleList){
            if(p.test(apple)){
                filteredApplesList.add(apple);
            }
        }
        return filteredApplesList;
    }

    public static void printAppleList(List<Apple> appleList){
        for (Apple apple : appleList) {
            System.out.println(apple.getWeight() + " - " + apple.getColor());
        }
    }

}


