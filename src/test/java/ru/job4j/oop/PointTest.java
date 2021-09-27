package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(1, 2);
        Point b = new Point(2, 4);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(2, 0.3));
    }

    @Test
    public void distance3d() {
        Point q = new Point(0, 2, 2);
        Point w = new Point(0, 3,2);
        double rsl = q.distance3d(w);
        assertThat(rsl,closeTo(1,0.001));
    }
}