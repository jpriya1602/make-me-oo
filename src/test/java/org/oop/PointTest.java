package org.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    @Test
    void shouldReturnXWhenGetXIsCalled(){
        Point point = new Point(2, 2);

        assertEquals(2, point.getX());
    }

    @Test
    void shouldReturnYWhenGetYIsCalled(){
        Point point = new Point(5, 5);

        assertEquals(5, point.getY());
    }

    @Test
    void shouldReAssignXWhenSetXIsCalled() {
        Point point = new Point(3,3);
        point.setX(7);

        assertEquals(7, point.getX());
    }

    @Test
    void shouldReassignYWhenSetYIsCalled() {
        Point point = new Point(4,4);
        point.setY(6);

        assertEquals(6, point.getY());
    }
}