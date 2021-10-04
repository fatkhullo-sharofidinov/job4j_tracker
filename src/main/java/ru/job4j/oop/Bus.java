package ru.job4j.oop;

public class Bus implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " двигается по скоростным трассам и может развить скорость более "
        + speed() + " км/ч");
    }

    @Override
    public int speed() {
        return 150;
    }
}
