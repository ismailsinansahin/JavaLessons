package com.smlsnnshn.SelfStudies.BehaviorParameterization.$04_FilteringByAbstractCriteria;

public class AppleRedAndHeavyWeightPredicate implements ApplePredicate{

    public boolean test(Apple apple){
        return apple.getColor().equals("red") && apple.getWeight() > 150;
    }

}
