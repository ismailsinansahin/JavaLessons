package com.smlsnnshn.SelfStudies.FunctionalInterfaces;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class $04_HandlingBoxing {

    public static void main(String[] args) {

        //This comes with a performance cost. Boxed values are essentially a wrapper around
        //primitive types and are stored on the heap. Therefore, boxed values use more memory and
        //require additional memory lookups to fetch the wrapped primitive value.

        Predicate<Integer> oddNumbers = (Integer i) -> i%2 == 1;
        System.out.println("oddNumbers.test(1000) = " + oddNumbers.test(1000));

        //Java 8 brings a specialized version of the functional interfaces we described earlier in order to
        //avoid autoboxing operations when the inputs or outputs are primitives. For example, in the
        //following code, using an IntPredicate avoids a boxing operation of the value 1000, whereas
        //using a Predicate<Integer> would box the argument 1000 to an Integer object:

        IntPredicate evenNumbers = (int i) -> i%2 == 0;
        System.out.println("evenNumbers.test(1000) = " + evenNumbers.test(1000));

    }

}
