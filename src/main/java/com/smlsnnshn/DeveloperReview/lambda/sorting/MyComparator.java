package com.smlsnnshn.DeveloperReview.lambda.sorting;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

    //ternary operator
    @Override
    public int compare(Integer o1, Integer o2){
        return (o1>02)?-1 : (o1<o2)?1 : 0;
    }

    //if block
//    @Override
//    public int compare(Integer o1, Integer o2){
//        if (o1>o2){
//            return -1;
//        }else if(o1<o2){
//            return 1;
//        }else{
//            return 0;
//        }
//    }

}
