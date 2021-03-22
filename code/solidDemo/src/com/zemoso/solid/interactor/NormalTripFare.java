package com.zemoso.solid.interactor;

import com.zemoso.solid.entity.CanCalculateFare;

public class NormalTripFare implements CanCalculateFare {
    @Override
    public void calculateFare() {
        System.out.println("Normal Trip Fare Calculated");
    }
}
