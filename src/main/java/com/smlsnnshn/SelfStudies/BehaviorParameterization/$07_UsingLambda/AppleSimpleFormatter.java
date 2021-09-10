package com.smlsnnshn.SelfStudies.BehaviorParameterization.$07_UsingLambda;

public class AppleSimpleFormatter implements AppleFormatter {

    @Override
    public String accept(Apple apple) {
        return "An apple of " + apple.getWeight() + " g.";
    }

}
