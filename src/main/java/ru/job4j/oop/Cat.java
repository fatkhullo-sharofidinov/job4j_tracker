package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;
    public void show() {
        System.out.println(this.name + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;

    }
    public String sound() {
        String voice = "may-may";
        return voice;
    }
    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("GAV ");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("Black cat ");
        black.show();

    }
}
