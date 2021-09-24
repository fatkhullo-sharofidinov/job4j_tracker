package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int acc) {
        this.load = acc;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(45);
        Battery second = new Battery(55);
        System.out.println("First: " + first.load + " Second: " + second.load);
        first.exchange(second);
        System.out.println("First: " + first.load + " Second: " + second.load);
    }
}
