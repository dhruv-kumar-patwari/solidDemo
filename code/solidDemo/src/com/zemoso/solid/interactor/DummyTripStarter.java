package com.zemoso.solid.interactor;

import com.zemoso.solid.entity.CanStartTrip;

public class DummyTripStarter implements CanStartTrip {
    @Override
    public void startTrip() {
        System.out.println("No trip started. This is a dummy method.");
    }
}
