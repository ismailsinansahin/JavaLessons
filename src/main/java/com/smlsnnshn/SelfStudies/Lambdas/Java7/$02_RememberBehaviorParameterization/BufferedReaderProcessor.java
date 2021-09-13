package com.smlsnnshn.SelfStudies.Lambdas.Java7.$02_RememberBehaviorParameterization;

import java.io.BufferedReader;
import java.io.IOException;

//We explained earlier that lambdas can be used only in the context of a functional interface.
//We need to create one that matches the signature BufferedReader -> String
//and that may throw an IOException. Let’s call this interface BufferedReaderProcessor:

@FunctionalInterface
public interface BufferedReaderProcessor {
    String process(BufferedReader br) throws IOException;
}
