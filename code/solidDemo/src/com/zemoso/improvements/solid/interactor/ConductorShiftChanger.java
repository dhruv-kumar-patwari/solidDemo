package com.zemoso.improvements.solid.interactor;

import com.zemoso.improvements.solid.entity.CanChangeShift;

public class ConductorShiftChanger implements CanChangeShift {
    @Override
    public String changeShift(String name) {
        System.out.println("Conductor shift changed");
        return name;
    }
}
