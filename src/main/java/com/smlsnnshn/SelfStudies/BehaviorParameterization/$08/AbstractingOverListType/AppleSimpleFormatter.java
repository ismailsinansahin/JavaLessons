package com.smlsnnshn.SelfStudies.BehaviorParameterization.$08.AbstractingOverListType;

public class AppleSimpleFormatter implements AppleFormatter {

    @Override
    public String accept(Apple apple) {
        return "An apple of " + apple.getWeight() + " g.";
    }

}
