package com.zemoso.improvements.notSolid;

public class Bus { // Single Responsibility and Interface Segrigation Violated
    private String driverName;
    private String conductorName;
    private double minimumFare;

    public Bus() {
        System.out.println("This is a Bus!!");
    }

    public String getDriverOnDuty(){
        return driverName + " is currently on duty.";
    }

    public String getConductorOnDuty(){
        return conductorName + " is currently on duty.";
    }

    public void changeShiftOfDriver(String name){
        driverName = name;
    }

    public void changeShiftOfConductor(String name){
        conductorName = name;
    }

    public void changeMinimumFare(double newFare){
        minimumFare = newFare;
    }

    public void startTrip(){
        System.out.println("Normal Trip Started");
    }

    public void startPrivateTrip(){
        System.out.println("Private Trip Started");
    }

    public void calculateFareForNormalTrip(){
        System.out.println("Fare Calculated");
    }

    public void calculateFareForPrivateTrip(){
        System.out.println("Private Trip Fare Calculated.");
    }
} // Open Close Violated. Have to recompile all the child classes if any functionality is changed.
