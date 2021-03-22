package com.zemoso.improvements.notSolid;

import com.zemoso.notSolid.Bus;
import com.zemoso.notSolid.GovernmentBus;
import com.zemoso.notSolid.PrivateBus;
import com.zemoso.notSolid.ToyBus;

public class DriverClass {
    public static void main(String[] args) {
        nonSolidExample();
    }

    private static void nonSolidExample() {
        demonstratingToyBusExample();
        demonstratingPrivateBusExample();
        demonstratingGovernmentBusExample();
    }

    private static void demonstratingToyBusExample() {
        Bus kidsToyBus = new com.zemoso.notSolid.ToyBus();

        if(kidsToyBus instanceof ToyBus){
            System.out.println("You cannot start a trip here or perform any other operations"); // Dependency Inversion Violated Here.
        }
    }

    private static void demonstratingPrivateBusExample() {
        System.out.println();
        com.zemoso.notSolid.PrivateBus orangeBus = new PrivateBus();

        orangeBus.changeShiftOfDriver("Ravi");
        orangeBus.changeShiftOfConductor("Shankar");
        orangeBus.calculateFareForPrivateTrip();
        orangeBus.getDriverOnDuty();
    }

    private static void demonstratingGovernmentBusExample() {
        System.out.println();
        com.zemoso.notSolid.GovernmentBus apsrtc = new GovernmentBus();

        apsrtc.changeShiftOfDriver("Ram");
        apsrtc.changeShiftOfConductor("Shekhar");
        apsrtc.calculateFareForNormalTrip();
        apsrtc.getDriverOnDuty();
    }
}
