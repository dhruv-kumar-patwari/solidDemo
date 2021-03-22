package com.zemoso.improvements.solid;

import com.zemoso.improvements.solid.entity.*;
import com.zemoso.improvements.solid.interactor.DummyShiftChanger;
import com.zemoso.improvements.solid.interactor.DummyTripFare;
import com.zemoso.improvements.solid.interactor.DummyTripStarter;
import com.zemoso.improvements.solid.interactor.PrivateTripFare;

public class DriverClass {
    public static void main(String[] args) {
        TripStarter dummyTrip = new TripStarter(new DummyTripStarter());
        dummyTrip.startTrip();

        AutoFareCalculator dummyTripFare = new AutoFareCalculator(new DummyTripFare()); // Can replace this with cab fare calculator
        dummyTripFare.calculateFare();

        BusShiftChanger dummyShiftChanger = new BusShiftChanger();
        dummyShiftChanger.printDriverAndConductorOnDuty();
        dummyShiftChanger.setConductorOnDuty(new DummyShiftChanger(), "Dhruv");
        dummyShiftChanger.printDriverAndConductorOnDuty();

        AutoFareCalculator dummyTripFareCab = new AutoFareCalculator(new PrivateTripFare());
        dummyTripFareCab.calculateFare(); // Liscov Substitution
    }
}
