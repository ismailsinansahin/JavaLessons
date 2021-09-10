package com.smlsnnshn.SelfStudies.BehaviorParameterization.$03_ThirdAttempt;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //We are creating list of Apples here

        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(160,"green"));
        appleList.add(new Apple(150,"red"));
        appleList.add(new Apple(140,"green"));
        appleList.add(new Apple(130,"red"));
        appleList.add(new Apple(120,"green"));
        appleList.add(new Apple(110,"red"));

        System.out.println("******* All Apples ********");
        printAppleList(appleList);

        //And if we want to use this ugly method
        //This solution is extremely bad. First, the client code looks terrible.
        //What do true and false mean?
        //In addition, this solution doesn’t cope well with changing requirements.
        //What if the farmer asks you to filter with different attributes of an apple,
        //for example, its size, its shape, its origin, and so on?
        //Furthermore, what if the farmer asks you for more complicated queries
        //that combine attributes, such as green apples that are also heavy?
        List<Apple> greenApples = filterApples(appleList, "green", 0, true);
        List<Apple> heavyApples = filterApples(appleList, "", 150, false);
        System.out.println("******* Green Apples ********");
        printAppleList(greenApples);
        System.out.println("******* Heavy Apples ********");
        printAppleList(heavyApples);

    }

    //Our ugly attempt of merging all attributes appears as follows

    public static List<Apple> filterApples(List<Apple> appleList, String color, int weight, boolean flag){
        List<Apple> filteredApplesList = new ArrayList<>();
        for (Apple apple : appleList){
            if((flag && apple.getColor().equals(color)) ||
                    (!flag && apple.getWeight() > weight)){
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


