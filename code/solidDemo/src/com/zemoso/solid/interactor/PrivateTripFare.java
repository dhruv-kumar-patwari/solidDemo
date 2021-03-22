package com.zemoso.solid.interactor;

import com.zemoso.solid.entity.CanCalculateFare;

public class PrivateTripFare implements CanCalculateFare {
    @Override
    public void calculateFare() {
        System.out.println("Private Trip Fare Calculated");
    }
}
