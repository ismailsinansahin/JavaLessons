package com.smlsnnshn.SelfStudies.BehaviorParameterization.$02_SecondAttempt;

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

        //More flexible way can be adding a parameter to our filtering method
        //and parameterize the color
        //We can see the example in the second attempt

        //And if we want to filter green an red apples
        //We need to create two methods filtering red and green apples

        List<Apple> greenApplesList = filterApplesByColor(appleList, "green");
        List<Apple> redApplesList = filterApplesByColor(appleList, "red");

        System.out.println("******* Green Apples ********");
        printAppleList(greenApplesList);
        System.out.println("******* Red Apples ********");
        printAppleList(redApplesList);

        //What if our farmer wants to filter big and small apples now?
        //The easy way is to parameterize the weight of apples and create another filtering method

        List<Apple> heavyApplesList = filterApplesByWeight(appleList, 150);
        System.out.println("******* Heavy Apples ********");
        printAppleList(heavyApplesList);

        //That is a good solution but if we use this way in our project,
        //there will be too much duplication in our code.
        //So we can think filtering every attribute we can think in our methods
        //It will be shown in the third attempt

    }

    //So we can combine filterGreenApples and filterRedApples methods together

    public static List<Apple> filterApplesByColor(List<Apple> appleList, String color){
        List<Apple> filteredApplesList = new ArrayList<>();
        for (Apple apple : appleList){
            if(apple.getColor().equals(color)) filteredApplesList.add(apple);
        }
        return filteredApplesList;
    }

    public static void printAppleList(List<Apple> appleList){
        for (Apple apple : appleList) {
            System.out.println(apple.getWeight() + " - " + apple.getColor());
        }
    }

    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> filteredApplesList = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                filteredApplesList.add(apple);
            }
        }
        return filteredApplesList;
    }

}


