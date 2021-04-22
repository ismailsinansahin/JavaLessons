package com.smlsnnshn.DeveloperReview.lambda_javabrains.examples2;

public class ClosuresInLambda {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        //This is a lambda implementation
        doProcess(a, i -> System.out.println(i+b));

        //This is an anonymous class implementation
        doProcess(a, new Process() {
            @Override
            public void process(int i) {
                // b = 40; //it gives an error that it should be a final
                System.out.println(i+b);
            }
        });

    }

    public static void doProcess(int i, Process p){
        p.process(i);
    }

}

interface Process{
    void process(int i);
}
