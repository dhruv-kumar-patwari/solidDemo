package com.zemoso.solid.entity;

public class BusClass {
    private String driverOnDuty = null;
    private String conductorOnDuty = null;
    protected CanChangeShift changeShift;
    protected CanCalculateFare calculateFare;
    protected CanStartTrip startTrip;

    public BusClass(CanStartTrip startTrip, CanCalculateFare calculateFare) {
        this.calculateFare = calculateFare;
        this.startTrip = startTrip;
    }

    public void printDriverAndConductorOnDuty(){
        System.out.println("Driver: " + driverOnDuty);
        System.out.println("Conductor: " + conductorOnDuty);
    }

    public void setDriverOnDuty(CanChangeShift changeShift, String driverOnDuty) {
        this.changeShift = changeShift;
        this.driverOnDuty = changeShift.changeShift(driverOnDuty);
    }

    public void setConductorOnDuty(CanChangeShift changeShift, String conductorOnDuty) {
        this.changeShift = changeShift;
        this.conductorOnDuty = changeShift.changeShift(conductorOnDuty);
    }

    public void calculateFare(){
        calculateFare.calculateFare();
    }

    public void startTrip(){
        startTrip.startTrip();
    }
}
