package com.smlsnnshn.SelfStudies.Lambdas.Java7.$02_RememberBehaviorParameterization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    //We explained earlier that lambdas can be used only in the context of a functional interface.
    //We need to create one that matches the signature BufferedReader -> String
    //and that may throw an IOException. Let’s call this interface BufferedReaderProcessor:
    //We can now use this interface as the argument to our new processFile method:

    //Any lambdas of the form BufferedReader -> String can be passed as arguments, because they
    //match the signature of the process method defined in the Buffered-ReaderProcessor interface.
    //You now need only a way to execute the code represented by the lambda inside the body of
    //processFile. Remember, lambda expressions let you provide the implementation of the abstract
    //method of a functional interface directly inline, and they treat the whole expression as an
    //instance of a functional interface. You can therefore call the method process on the resulting
    //BufferedReaderProcessor object inside the processFile body to perform the processing:

    public static void main(String[] args) throws IOException {
//        String text = processFile();
    }

    public static String processFile(BufferedReaderProcessor p) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            return p.process(br);
        }
    }

}
