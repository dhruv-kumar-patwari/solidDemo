package com.zemoso.improvements.solid.entity;

public class AutoFareCalculator extends FareCalculator { // Open Close Followed Here
    public AutoFareCalculator(CanCalculateFare fareCalculator) {
        super(fareCalculator);
    }

    @Override
    public void calculateFare() {
        System.out.println("Auto Fare Calculated.");
        super.calculateFare();
    }
}
