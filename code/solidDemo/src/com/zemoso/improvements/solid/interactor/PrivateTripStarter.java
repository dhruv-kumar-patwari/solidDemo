package com.zemoso.improvements.solid.interactor;

import com.zemoso.improvements.solid.entity.CanStartTrip;

public class PrivateTripStarter implements CanStartTrip {
    @Override
    public void startTrip() {
        System.out.println("Private Trip Started");
    }
}
