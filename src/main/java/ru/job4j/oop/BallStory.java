package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Fox fox = new Fox();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Ball ball = new Ball();
        ball.tryRun(true);
        fox.tryEat(ball);
        hare.tryEat(ball);
        wolf.tryEat(ball);
    }
}
