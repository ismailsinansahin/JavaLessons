package com.smlsnnshn.DeveloperReview.lambda_javabrains.implementingLambda;

import com.smlsnnshn.DeveloperReview.lambda_javabrains.classicOOP.Greeter;
import com.smlsnnshn.DeveloperReview.lambda_javabrains.classicOOP.Greeting;
import com.smlsnnshn.DeveloperReview.lambda_javabrains.classicOOP.HelloWorldGreeting;


public class LambdaAsInterfaceType {

    public static void main(String[] args) {

    Greeter greeter = new Greeter();
    Greeting helloWorldGreeting = new HelloWorldGreeting();
    greeter.greet(helloWorldGreeting);

    Greeting lambdaGreeting = () -> System.out.println("Hello World Lambda!");
    greeter.greet(lambdaGreeting);

    }

}
