package com.smlsnnshn.SelfStudies.FunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class $03_FunctionMain {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Lambdas", "in", "Java");
        System.out.println(stringList.get(0) instanceof String);

        List<Integer> integerList = map(stringList, (String s) -> s.length());
        System.out.println(integerList.get(0) instanceof Integer);

    }

    public static List<Integer> map(List<String> stringList, Function<String, Integer> f){
        List<Integer> integerList = new ArrayList<>();
        for(String string : stringList){
            integerList.add(f.apply(string));
        }
        return integerList;
    }

}
