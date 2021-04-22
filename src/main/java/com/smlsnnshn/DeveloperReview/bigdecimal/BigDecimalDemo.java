package com.smlsnnshn.DeveloperReview.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalDemo {

    public static void main(String[] args) {

        double a0=0.03;
        double b0=0.04;
        double c0=b0-a0;
        System.out.println(c0);

        BigDecimal a1 = new BigDecimal("0.03");
        BigDecimal b1 = new BigDecimal("0.04");
        BigDecimal c1 = b1.subtract(a1);
        System.out.println(c1);

        //Creating a bigdecimal
        BigDecimal bigDecimal = new BigDecimal("10.25");
        BigDecimal bigDecimal1 = BigDecimal.valueOf(10.25);
        BigDecimal bigDecimal2 = new BigDecimal(10.25);
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        BigDecimal bigDecimal4 = BigDecimal.TEN;
        BigDecimal bigDecimal5 = BigDecimal.ONE;

        //Arithmetic operators
        BigDecimal a = BigDecimal.TEN;
        BigDecimal b = BigDecimal.valueOf(3.5);
        BigDecimal c = BigDecimal.valueOf(4);
        BigDecimal sumResult = a.add(b);
        System.out.println(sumResult);

        BigDecimal sumReults2 = a.add(b).add(c);
        System.out.println(sumReults2);

        BigDecimal subtractResult = c.subtract(a).subtract(b);
        System.out.println(subtractResult);

        BigDecimal multiplyResult = c.multiply(b).multiply(a);
        System.out.println(multiplyResult);

        BigDecimal divideResult = a.divide(c);
        System.out.println(divideResult);

        BigDecimal divideResult2 = a.divide(b,2);
        System.out.println(divideResult2);
        
        BigDecimal combineResult = b.multiply(c).add(a).subtract(b);
        System.out.println(combineResult);

    }

}
