package com.smlsnnshn.SelfStudies.BehaviorParameterization.$04_FilteringByAbstractCriteria;

public class AppleHeavyWeightPredicate implements ApplePredicate{

    public boolean test(Apple apple){
        return apple.getWeight()>150;
    }
}
