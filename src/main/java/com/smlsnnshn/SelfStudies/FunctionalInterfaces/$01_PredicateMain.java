package com.smlsnnshn.SelfStudies.FunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class $01_PredicateMain {

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Sinan", "", "Melek");
        System.out.println("listOfStrings.size() = " + listOfStrings.size());

        //Long way
//        Predicate<String> emptyStringPredicate = (String s) -> s.isEmpty();
//        List<String> emptyStringList = filter(listOfStrings, emptyStringPredicate);
//        System.out.println("emptyStringList.size() = " + emptyStringList.size());

        //Short way
        filter(listOfStrings, (String s) -> s.isEmpty());
        System.out.println("emptyStringList.size() = " + (filter(listOfStrings, (String s) -> s.isEmpty())).size());

    }

    private static List<String> filter(List<String> stringList, Predicate<String> p) {
        List<String> emptyStringList = new ArrayList<>();
        for(String s : stringList){
            if (p.test(s)) emptyStringList.add(s);
        }
        return emptyStringList;
    }

}
