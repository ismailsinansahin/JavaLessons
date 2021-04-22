package com.smlsnnshn.DeveloperReview.lambda_javabrains.MethodReferenceExamples;

public class Example1 {

    public static void main(String[] args) {

        Thread t = new Thread(Example1::printMessage);
        //Example1::printMessage = () -> printMessge() // () -> method()
        t.start();

    }

    public static void printMessage(){
        System.out.println("Hello");
    }

}
