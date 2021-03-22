package com.zemoso.improvements.solid.entity;

public class CabFareCalculator extends FareCalculator { // Open Close Followed Here
    public CabFareCalculator(CanCalculateFare fareCalculator) {
        super(fareCalculator);
    }

    @Override
    public void calculateFare() {
        System.out.println("Cab Fare Calculated.");
        super.calculateFare();
    }
}

