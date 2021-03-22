package com.zemoso.improvements.notSolid;

public class ToyBus extends Bus {
    public ToyBus() {
        System.out.println("This is a Toy Bus.");
    }

    @Override
    public void startTrip() {
        System.out.println("Cannot Start a trip. It is a Toy Bus"); // Liskov's Substitution violated
    }
}
