package ru.job4j.tracker.transport;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Transport is drive.");
    }

    @Override
    public void passengers(int count) {
        System.out.println("The number of passengers: " + count);
    }

    @Override
    public int refuel(int liters) {
        return liters * 50;
    }
}
