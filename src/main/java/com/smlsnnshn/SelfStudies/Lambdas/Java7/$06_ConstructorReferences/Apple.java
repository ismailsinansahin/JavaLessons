package com.smlsnnshn.SelfStudies.Lambdas.Java7.$06_ConstructorReferences;

public class Apple {

    private int weight;
    private String color;

    public Apple(){}

    public Apple(int weight) {
        this.weight = weight;
    }

    public Apple(String color, int weight) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
