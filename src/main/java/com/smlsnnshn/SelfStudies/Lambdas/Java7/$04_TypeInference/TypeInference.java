package com.smlsnnshn.SelfStudies.Lambdas.Java7.$04_TypeInference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TypeInference {

    public static void main(String[] args) {

        //We are creating list of Apples here

        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(160,"red"));
        appleList.add(new Apple(150,"red"));
        appleList.add(new Apple(140,"green"));
        appleList.add(new Apple(130,"red"));
        appleList.add(new Apple(120,"green"));
        appleList.add(new Apple(110,"red"));

        //Note that sometimes it’s more readable to include the types explicitly and sometimes more
        //readable to exclude them. There’s no rule for which way is better; developers must make their
        //own choices about what makes their code more readable.

//        Comparator<Apple> appleComparator = (Apple a1,Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
//        Comparator<Apple> appleComparator = (a1,a2) -> a1.getWeight().compareTo(a2.getWeight());

    }

}
