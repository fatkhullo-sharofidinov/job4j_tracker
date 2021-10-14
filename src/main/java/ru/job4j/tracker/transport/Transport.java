package ru.job4j.tracker.transport;

public interface Transport {
    void drive();
    void passengers(int count);
    int refuel(int liters);
}
