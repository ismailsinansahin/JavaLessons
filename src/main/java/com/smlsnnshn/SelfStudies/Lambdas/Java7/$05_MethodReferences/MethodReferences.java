package com.smlsnnshn.SelfStudies.Lambdas.Java7.$05_MethodReferences;

import java.util.Arrays;
import java.util.List;

public class MethodReferences {

    public static void main(String[] args) {

        //There are three main kinds of method references:
        //1. A method reference to a static method (for example, the method parseInt of Integer, written
        //Integer::parseInt)
        //2. A method reference to an instance method of an arbitrary type (for example, the method
        //length of a String, written String::length)
        //3. A method reference to an instance method of an existing object (for example, suppose you
        //have a local variable expensiveTransaction that holds an object of type Transaction, which
        //supports an instance method getValue; you can write expensiveTransaction::getValue)

        List<String> str1 = Arrays.asList("a","b","A","B");
        str1.sort((s1, s2) -> s1.compareToIgnoreCase(s2));

        //The lambda expression has a signature compatible with the function descriptor of Comparator.
        //Using the recipes described previously, the example can also be written using a method
        //reference as follows:

        List<String> str2 = Arrays.asList("a","b","A","B");
        str2.sort(String::compareToIgnoreCase);

        //Note that the compiler goes through a similar type-checking process as for lambda expressions
        //to figure out whether a method reference is valid with a given functional interface: the signature
        //of the method reference has to match the type of the context.

    }

}
