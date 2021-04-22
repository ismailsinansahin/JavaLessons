package com.smlsnnshn.DeveloperReview.lambda_javabrains.implementingLambda;

import com.smlsnnshn.DeveloperReview.lambda_javabrains.classicOOP.Greeter;
import com.smlsnnshn.DeveloperReview.lambda_javabrains.classicOOP.Greeting;
import com.smlsnnshn.DeveloperReview.lambda_javabrains.classicOOP.HelloWorldGreeting;

public class LambdasVsInterfaceImplementations {

    public static void main(String[] args) {

    Greeter greeter = new Greeter();

    Greeting helloWorldGreeting = new HelloWorldGreeting();
    Greeting lambdaGreeting = () -> System.out.println("Hello World Lambda!");

    helloWorldGreeting.perform(); //Hello World Greeting!
    lambdaGreeting.perform();     //Hello World Lambda!

    //Actually we do not need to create HelloWorldGreeting class,
    //instead we can use anonymous inner class
    //we can delete line 14

    Greeting innerClassGreeting = new Greeting(){
        public void perform(){
            System.out.println("Hello World InnerClass!");
        }
    };

    innerClassGreeting.perform();



    }

}
