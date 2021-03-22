package com.zemoso.solid.interactor;

import com.zemoso.solid.entity.CanChangeShift;

public class DriverShiftChanger implements CanChangeShift {
    @Override
    public String changeShift(String name) {
        System.out.println("Driver shift changed");
        return name;
    }
}
