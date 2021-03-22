package com.zemoso.improvements.solid.entity;

public class TripStarter {
    protected CanStartTrip tripStarter;

    public TripStarter(CanStartTrip tripStarter) {
        this.tripStarter = tripStarter;
    }

    public void startTrip() {
        tripStarter.startTrip();
    }
}
