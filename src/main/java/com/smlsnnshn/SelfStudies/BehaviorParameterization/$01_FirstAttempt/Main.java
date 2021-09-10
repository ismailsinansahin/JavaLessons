package com.smlsnnshn.SelfStudies.BehaviorParameterization.$01_FirstAttempt;

import java.util.ArrayList;
import java.util.Collections;
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

        //And if we want to filter only green apples
        //We need to create a method filtering only green apples

        System.out.println("******* Filtered Apples ********");
        List<Apple> greenApplesList = filterGreenApples(appleList);
        printAppleList(greenApplesList);

        //What if we need to filter red apples? What can we do?
        //A naive solution would be duplicate our filterGreenApples method
        //If we need more filtering options we need to create numerous methods
        //which is very similar to each other

        //More flexible way can be adding a parameter to our filtering method
        //and parameterize the color
        //We can see the example in the second attempt

    }

    public static List<Apple> filterGreenApples(List<Apple> appleList){
        List<Apple> greenApplesList = new ArrayList<>();
        for (Apple apple : appleList){
            if(apple.getColor().equals("green")) greenApplesList.add(apple);
        }
        return greenApplesList;
    }

    public static List<Apple> filterRedApples(List<Apple> appleList){
        List<Apple> greenApplesList = new ArrayList<>();
        for (Apple apple : appleList){
            if(apple.getColor().equals("red")) greenApplesList.add(apple);
        }
        return greenApplesList;
    }

    public static void printAppleList(List<Apple> appleList){
        for (Apple apple : appleList) {
            System.out.println(apple.getWeight() + " - " + apple.getColor());
        }
    }

}


