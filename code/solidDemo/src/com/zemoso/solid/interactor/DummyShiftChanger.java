package com.zemoso.solid.interactor;

import com.zemoso.solid.entity.CanChangeShift;

public class DummyShiftChanger implements CanChangeShift {
    @Override
    public String changeShift(String name) {
        System.out.println("This is a Dummy shift changer. No shift will be changed.");
        return null;
    }
}
