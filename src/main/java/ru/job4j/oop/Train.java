package ru.job4j.oop;

public class Train implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " передвигается по рельсам и может развить скорость более "
        + speed() + " км/ч");
    }

    @Override
    public int speed() {
        return 330;
    }
}