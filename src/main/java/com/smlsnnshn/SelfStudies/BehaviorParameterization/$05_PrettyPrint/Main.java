package com.smlsnnshn.SelfStudies.BehaviorParameterization.$05_PrettyPrint;

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
        System.out.println("******* Simple Formatter ********");
        prettyPrintApple(appleList, new AppleSimpleFormatter());
        System.out.println("******* All Fancy Formatter ********");
        prettyPrintApple(appleList, new AppleFancyFormatter());

        //Now let's write a prettyPrintApple method that takes a List of Apples and that can be parameterized with
        //multiple ways to generate a String output from an apple (a bit like multiple customized toString
        //methods). For example, you could tell your pretty-PrintApple method to print only the weight of
        //each apple. In addition, you could tell your prettyPrintApple method to print each apple
        //individually and mention whether it’s heavy or light.

    }

    public static void prettyPrintApple(List<Apple> appleList, AppleFormatter a){
        for(Apple apple : appleList){
            System.out.println(a.accept(apple));
        }
    }

}


