package com.zemoso.solid.interactor;

import com.zemoso.solid.entity.CanCalculateFare;

public class DummyTripFare implements CanCalculateFare {
    @Override
    public void calculateFare() {
        System.out.println("This is a dummy trip. No fare will be calculated");
    }
}
