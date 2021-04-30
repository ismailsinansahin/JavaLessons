package com.smlsnnshn.DeveloperReview.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalDemo {

    public static void main(String[] args) {

        double a0=0.03;
        double b0=0.04;
        double c0=b0-a0;
        System.out.println("c0 = " + c0);

        BigDecimal a1 = new BigDecimal("0.03");
        BigDecimal b1 = new BigDecimal("0.04");
        BigDecimal c1 = b1.subtract(a1);
        System.out.println("c1 = " + c1);

        //Creating a bigdecimal
        BigDecimal bigDecimal = new BigDecimal("10.25");
        BigDecimal bigDecimal1 = BigDecimal.valueOf(10.25);
        BigDecimal bigDecimal2 = new BigDecimal(10.25);
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        BigDecimal bigDecimal4 = BigDecimal.TEN;
        BigDecimal bigDecimal5 = BigDecimal.ONE;
        System.out.println("bigDecimal = " + bigDecimal);
        System.out.println("bigDecimal1 = " + bigDecimal1);
        System.out.println("bigDecimal2 = " + bigDecimal2);
        System.out.println("bigDecimal3 = " + bigDecimal3);
        System.out.println("bigDecimal4 = " + bigDecimal4);
        System.out.println("bigDecimal5 = " + bigDecimal5);

        //Arithmetic operators
        BigDecimal a = BigDecimal.TEN;
        BigDecimal b = BigDecimal.valueOf(3.5);
        BigDecimal c = BigDecimal.valueOf(4);

        BigDecimal sumResult1 = a.add(b);
        System.out.println("sumResult1 = " + sumResult1);

        BigDecimal sumReults2 = a.add(b).add(c);
        System.out.println("sumReults2 = " + sumReults2);

        BigDecimal subtractResult = c.subtract(a).subtract(b);
        System.out.println("subtractResult = " + subtractResult);

        BigDecimal multiplyResult = c.multiply(b).multiply(a);
        System.out.println("multiplyResult = " + multiplyResult);

        BigDecimal divideResult = a.divide(c);
        System.out.println("divideResult = " + divideResult);

        BigDecimal divideResult2 = a.divide(b,2);
        System.out.println("divideResult2 = " + divideResult2);
        
        BigDecimal combineResult = b.multiply(c).add(a).subtract(b);
        System.out.println("combineResult = " + combineResult);

    }

}
