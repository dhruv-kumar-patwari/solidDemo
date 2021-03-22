package com.zemoso.solid.interactor;

import com.zemoso.solid.entity.CanStartTrip;

public class PrivateTripStarter implements CanStartTrip {
    @Override
    public void startTrip() {
        System.out.println("Private Trip Started");
    }
}
