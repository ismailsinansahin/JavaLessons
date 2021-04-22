package com.smlsnnshn.DeveloperReview.lambda.course;

public class CourseTest {

    public static void main(String[] args) {

        Course java1 = new Java();
        java1.study();

        Course selenium1 = new Selenium();
        selenium1.study();

        System.out.println("********FORGET ABOUT THİS PART********");

        Course java2 = new Course() {
            @Override
            public void study() {
                System.out.println("Studying Java");
            }
        };
        java2.study();

        Course selenium2 = new Course() {
            @Override
            public void study() {
                System.out.println("Studying Selenium");
            }
        };
        selenium2.study();

        System.out.println("********************************");

        Course javaCourse = () -> System.out.println("Studying Java");
        javaCourse.study();

        Course seleniumCourse = () -> System.out.println("Studying Selenium");
        seleniumCourse.study();

    }

}
