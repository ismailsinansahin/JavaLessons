package com.smlsnnshn.DeveloperReview.lambda_javabrains.implementingLambda;

public class TypeInference {

    public static void main(String[] args) {

//        version-1
//        StringLengthLambda myLambda = (String s) -> s.length();
//        System.out.println(myLambda.getLength("Hello Lambda!"));

//        version-2
//        StringLengthLambda myLambda = (s) -> s.length();
//        System.out.println(myLambda.getLength("Hello Lambda!"));

//        version-3
//        StringLengthLambda myLambda = s -> s.length();
//        System.out.println(myLambda.getLength("Hello Lambda!"));

//        version-4
        printLambda(s -> s.length());

    }

    public static void printLambda(StringLengthLambda l){
        System.out.println(l.getLength("Hello Lambda"));
    }

    interface StringLengthLambda{
        int getLength(String s);
    }

}
