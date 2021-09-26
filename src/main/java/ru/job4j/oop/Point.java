package ru.job4j.oop;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;

    private int y;

    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow((this.x - that.x), 2) + pow((this.y - that.y), 2) + pow((this.z - that.z), 2));
    }

    public void info() {
        System.out.println("Point[" + this.x + ", " + this.y + "]");
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);

        Point v = new Point(2, 1);
        Point n = new Point(2, 4);
        double distance1 = v.distance(n);
        System.out.println(dist);

        Point c = new Point(0, 2, 2);
        Point d = new Point(0, 3,2);
        double distance = c.distance3d(d);
        System.out.println(distance);
    }

}
