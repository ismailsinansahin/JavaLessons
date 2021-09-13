package com.smlsnnshn.SelfStudies.FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class $02_ConsumerMain {

    public static void main(String[] args) {

        List<Integer> numbersList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        forEach(numbersList, (Integer i) -> System.out.println(i));

    }

    public static <Integer> void forEach(List<Integer> numbersList, Consumer<Integer> c){
        for(Integer i : numbersList){
            c.accept(i);
        }
    }

}
