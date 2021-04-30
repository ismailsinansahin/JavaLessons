package com.smlsnnshn.DeveloperReview.streams;

import com.smlsnnshn.DeveloperReview.collections.ArrayLists;
import com.smlsnnshn.DeveloperReview.oop.encapsulation.Role;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {

        //creating stream from an array
        String[] courses = {"Java", "JS", "TS", "API", "SELENIUM"};
        Stream<String> coursesStream = Arrays.stream(courses);

        //creating stream from a collection
        Stream<Role> roleStream = ArrayLists.createRoleList().stream();

        //creating stream from specified values
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6);

    }

}
