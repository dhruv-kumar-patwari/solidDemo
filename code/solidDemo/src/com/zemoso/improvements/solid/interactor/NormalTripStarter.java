package com.zemoso.improvements.solid.interactor;

import com.zemoso.improvements.solid.entity.CanStartTrip;

public class NormalTripStarter implements CanStartTrip {
    @Override
    public void startTrip() {
        System.out.println("Normal Trip Started");
    }
}
