package com.smlsnnshn.SelfStudies.BehaviorParameterization.AppleComparingExample_1_FirstAttempt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //When we have a list of comparable elements such as integers and strings
        //Collections.sort() method works without any step
        List<Integer> numbersList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 9, 8, 7, 6, 5));
        Collections.sort(numbersList);
        numbersList.forEach(System.out::print);

        //But if we have a list of non-comparable data types such as apple
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(160,"green"));
        appleList.add(new Apple(150,"red"));
        appleList.add(new Apple(140,"green"));
        appleList.add(new Apple(130,"red"));
        appleList.add(new Apple(120,"green"));
        appleList.add(new Apple(110,"red"));

        //And we try to use Collections.sort()
        //Collections.sort(appleList);
        //We have an error here
        //Because, to use sort method of Collections
        //all elements in the list must implement the Comparable interface.
        //Furthermore, all elements in the list must be mutually comparable
        //(that is, e1.compareTo(e2) must not throw a ClassCastException for any elements
        //e1 and e2 in the list).
        //So we need to implement Comparable in the Apple class
        //Let's do it in second example

    }

}


