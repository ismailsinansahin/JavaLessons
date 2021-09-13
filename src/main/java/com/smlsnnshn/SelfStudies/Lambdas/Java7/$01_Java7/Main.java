package com.smlsnnshn.SelfStudies.Lambdas.Java7.$01_Java7;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String text = processFile();
        System.out.println("text = " + text);
    }

    public static String processFile() throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            return br.readLine();
        }
    }

    //This current code is limited. You can read only the first line of the file. What if you’d like to
    //return the first two lines instead or even the word used most frequently? Ideally, you’d like to
    //reuse the code doing setup and cleanup and tell the processFile method to perform different
    //actions on the file. Does this sound familiar? Yes, you need to parameterize the behavior of
    //processFile. You need a way to pass behavior to processFile so it can execute different behaviors
    //using a BufferedReader.

}
