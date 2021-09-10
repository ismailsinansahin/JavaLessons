package com.smlsnnshn.SelfStudies.BehaviorParameterization.$04_FilteringByAbstractCriteria;

public class AppleGreenColorPredicate implements ApplePredicate{

    public boolean test(Apple apple){
        return "green".equals(apple.getColor());
    }

}
