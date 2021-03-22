package com.zemoso.improvements.solid.interactor;

import com.zemoso.improvements.solid.entity.CanCalculateFare;

public class PrivateTripFare implements CanCalculateFare {
    @Override
    public void calculateFare() {
        System.out.println("Private Trip Fare Calculated");
    }
}
