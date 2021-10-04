package ru.job4j.oop;

public class Airplane implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летает по воздуху и может развить скорость более "
                + speed() + " км/ч");
    }

    @Override
    public int speed() {
        return 900;
    }
}
