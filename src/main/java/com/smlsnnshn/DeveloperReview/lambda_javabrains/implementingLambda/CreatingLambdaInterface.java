package com.smlsnnshn.DeveloperReview.lambda_javabrains.implementingLambda;

public class CreatingLambdaInterface {

    public static void main(String[] args) {

        MyLambda greetingFunction = () -> System.out.println("Hello World!");

        MyDouble doubleNumberFunction = (int a) -> a * 2;

        MyAdd addFunction = (int a, int b) -> a + b;

        MySafeDivide safeDivideFunction = (int a, int b) -> {
            if (b==0) return 0;
            return a / b;
        };

        MyStringLength stringLengthCountFunction = (String s) -> s.length();

    }

}

interface MyLambda{void foo();}

interface MyDouble{int doubleNumber(int x);}

interface MyAdd{int add(int x, int y);}

interface MySafeDivide{int divide(int x, int y);}

interface MyStringLength{int length(String s);}
