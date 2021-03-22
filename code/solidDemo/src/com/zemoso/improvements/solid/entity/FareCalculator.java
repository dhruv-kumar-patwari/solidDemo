package com.zemoso.improvements.solid.entity;

public class FareCalculator{

    protected CanCalculateFare fareCalculator;

    public FareCalculator(CanCalculateFare fareCalculator) {
        this.fareCalculator = fareCalculator;
    }

    public void calculateFare(){
        fareCalculator.calculateFare();
    }
}

