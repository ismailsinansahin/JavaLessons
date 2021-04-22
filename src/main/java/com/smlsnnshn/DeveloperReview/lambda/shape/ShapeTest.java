package com.smlsnnshn.DeveloperReview.lambda.shape;

public class ShapeTest {

    public static void main(String[] args) {

        Drawable1 drawable1 = () -> System.out.println("Drawing a circle");
        drawable1.draw();

        Drawable2 drawable2 = shape -> System.out.println("Drawing a " + shape);
        drawable2.draw("Triangle");

        Drawable3 drawable3 = (shape, name) -> System.out.println(name + " is drawing a " + shape);
        drawable3.draw("Circle", "Mike");

        Drawable4 drawable4 = (shape, area) -> "Drawing a " + shape + " and it's area is " + area;
        drawable4.draw("Circle", 200);

        Drawable3 drawable31 = (shape, name) -> {
            System.out.println("What kind of shape is this? : " + shape);
            System.out.println("Who is drawing this shape?  : " + name);
        };
        drawable31.draw("Square", "Ismail");

    }

}
