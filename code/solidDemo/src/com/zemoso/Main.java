package com.zemoso;

import com.zemoso.notSolid.*;
import com.zemoso.solid.entity.BusClass;
import com.zemoso.solid.interactor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------");
        SolidExample();
    }

    private static void SolidExample() {
        demonstratingToyBusExampleSolid();
        demonstratingGovernmentBusExampleSolid();
        demonstratingPrivateBusExampleSolid();
    }

    private static void demonstratingToyBusExampleSolid() {
        BusClass ToyBus = new BusClass(new DummyTripStarter(), new DummyTripFare());
        ToyBus.calculateFare();
        ToyBus.startTrip();
        ToyBus.setConductorOnDuty(new DummyShiftChanger(), "Dhruv");
        ToyBus.setDriverOnDuty(new DummyShiftChanger(), "Dhruv");
        ToyBus.printDriverAndConductorOnDuty();
    }

    private static void demonstratingGovernmentBusExampleSolid() {
        System.out.println();
        BusClass tsrtc = new BusClass(new NormalTripStarter(), new NormalTripFare());
        tsrtc.calculateFare();
        tsrtc.startTrip();
        tsrtc.setConductorOnDuty(new ConductorShiftChanger(), "Dhruv");
        tsrtc.setDriverOnDuty(new DriverShiftChanger(), "Kumar");
        tsrtc.printDriverAndConductorOnDuty();
    }

    private static void demonstratingPrivateBusExampleSolid() {
        System.out.println();
        BusClass orangeTravels = new BusClass(new PrivateTripStarter(), new PrivateTripFare());
        orangeTravels.calculateFare();
        orangeTravels.startTrip();
        orangeTravels.setConductorOnDuty(new ConductorShiftChanger(), "Dhruv");
        orangeTravels.setDriverOnDuty(new DriverShiftChanger(), "Patwari");
        orangeTravels.printDriverAndConductorOnDuty();
    }
}
