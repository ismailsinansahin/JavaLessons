package com.smlsnnshn.SelfStudies.BehaviorParameterization.AppleComparingExample_2_WithComparable;

import com.smlsnnshn.SelfStudies.BehaviorParameterization.AppleComparingExample_1_FirstAttempt.Apple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Create apple list and add all apples
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(160,"green"));
        appleList.add(new Apple(150,"red"));
        appleList.add(new Apple(140,"green"));
        appleList.add(new Apple(130,"red"));
        appleList.add(new Apple(120,"green"));
        appleList.add(new Apple(110,"red"));

        //Print default version of the list
        System.out.println("******** DEFAULT VERSION OF THE LIST ********");
        for (Apple each : appleList) {
            System.out.println(each.getWeight() + " - " + each.getColor());
        }

        //Now, let's make a new attempt to sort our apples by using Collections.sort:
        //Collections.sort(appleList);


    }

}


