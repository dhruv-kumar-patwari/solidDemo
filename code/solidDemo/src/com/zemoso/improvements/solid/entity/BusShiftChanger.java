package com.zemoso.improvements.solid.entity;

public class BusShiftChanger { // Single Responsibility Followed here
    private String driverOnDuty = null;
    private String conductorOnDuty = null;
    protected CanChangeShift shiftChanger;

    public void printDriverAndConductorOnDuty() {
        System.out.println("Driver: " + driverOnDuty);
        System.out.println("Conductor: " + conductorOnDuty);
    }

    public void setDriverOnDuty(CanChangeShift shiftChanger, String driverOnDuty) {
        this.shiftChanger = shiftChanger;
        this.driverOnDuty = shiftChanger.changeShift(driverOnDuty);
    }

    public void setConductorOnDuty(CanChangeShift shiftChanger, String conductorOnDuty) {
        this.shiftChanger = shiftChanger;
        this.conductorOnDuty = shiftChanger.changeShift(conductorOnDuty);
    }
}
