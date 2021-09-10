package com.smlsnnshn.SelfStudies.BehaviorParameterization.AppleComparingExample_2_WithComparable;

public class Apple implements Comparable<Apple>{

    private int weight;
    private String color;

    public Apple(int weight, String color) {
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

    @Override
    public int compareTo(Apple a) {
//        return this.getWeight().;
    return  0;
    }

}


