package com.zemoso.improvements.solid.interactor;

import com.zemoso.improvements.solid.entity.CanCalculateFare;

public class NormalTripFare implements CanCalculateFare {
    @Override
    public void calculateFare() {
        System.out.println("Normal Trip Fare Calculated");
    }
}
