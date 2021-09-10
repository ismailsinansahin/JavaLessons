package com.smlsnnshn.SelfStudies.BehaviorParameterization.$08.AbstractingOverListType;

public class AppleFancyFormatter implements AppleFormatter {

    @Override
    public String accept(Apple apple) {
        String characteristic = apple.getWeight() > 150 ? "heavy" : "light";
        return "A " + characteristic + " " + apple.getColor() + " apple.";
    }

}
