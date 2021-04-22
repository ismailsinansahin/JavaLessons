package com.smlsnnshn.DeveloperReview.core;

public class Loops {

    public static void demoForIterator(){
        for (int i=0 ; i<5 ; i++){
            System.out.println(i);
        }
    }

    public static void demoForEach(){
        String[] cars = {"Honda", "Nissan", "Ford"};
        for(String each : cars){
            System.out.println(each);
        }
    }

}
