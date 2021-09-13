package com.smlsnnshn.SelfStudies.Lambdas.Java7.$03_Lambda;

import com.smlsnnshn.SelfStudies.Lambdas.Java7.$02_RememberBehaviorParameterization.BufferedReaderProcessor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String oneLine = processFile((BufferedReader br) -> br.readLine());
        String twoLines = processFile((BufferedReader br) -> br.readLine() + br.readLine());
        System.out.println("oneLine = " + oneLine);
        System.out.println("twoLines = " + twoLines);
    }

    public static String processFile(BufferedReaderProcessor p) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            return p.process(br);
        }
    }

    //So far, we’ve showed how we can make use of functional interfaces to pass lambdas. But we
    //had to define our own interfaces. In the next section we explore new interfaces that were added
    //to Java 8 that we can reuse to pass multiple different lambdas.

}
