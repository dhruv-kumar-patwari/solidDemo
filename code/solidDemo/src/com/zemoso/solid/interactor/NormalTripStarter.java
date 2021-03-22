package com.zemoso.solid.interactor;

import com.zemoso.solid.entity.CanStartTrip;

public class NormalTripStarter implements CanStartTrip {
    @Override
    public void startTrip() {
        System.out.println("Normal Trip Started");
    }
}
