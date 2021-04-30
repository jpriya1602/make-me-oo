package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleDistanceAndDirectionCalculatorTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);
        DistanceAndDirectionCalculator circleDistanceAndDirectionCalculator = new CircleDistanceAndDirectionCalculator(origin,origin);

        Assertions.assertEquals(0, circleDistanceAndDirectionCalculator.distance());
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);
        DistanceAndDirectionCalculator circleDistanceAndDirectionCalculator1 = new CircleDistanceAndDirectionCalculator(origin,point1);
        DistanceAndDirectionCalculator circleDistanceAndDirectionCalculator2 = new CircleDistanceAndDirectionCalculator(origin,point2);

        Assertions.assertEquals(1, circleDistanceAndDirectionCalculator1.distance());
        Assertions.assertEquals(1, circleDistanceAndDirectionCalculator2.distance());
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);
        DistanceAndDirectionCalculator circleDistanceAndDirectionCalculator = new CircleDistanceAndDirectionCalculator(point1,point2);

        Assertions.assertEquals(2, circleDistanceAndDirectionCalculator.distance());
    }

    @Test
    void originAndPointOnPostiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);
        DistanceAndDirectionCalculator circleDistanceAndDirectionCalculator1 = new CircleDistanceAndDirectionCalculator(origin,point1);
        DistanceAndDirectionCalculator circleDistanceAndDirectionCalculator2 = new CircleDistanceAndDirectionCalculator(origin,point2);

        Assertions.assertEquals(0, circleDistanceAndDirectionCalculator1.direction());
        Assertions.assertEquals(0, circleDistanceAndDirectionCalculator2.direction());
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);
        DistanceAndDirectionCalculator circleDistanceAndDirectionCalculator1 = new CircleDistanceAndDirectionCalculator(origin,point1);
        DistanceAndDirectionCalculator circleDistanceAndDirectionCalculator2 = new CircleDistanceAndDirectionCalculator(origin,point2);

        Assertions.assertEquals(Math.PI, circleDistanceAndDirectionCalculator1.direction());
        Assertions.assertEquals(Math.PI, circleDistanceAndDirectionCalculator2.direction());
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);
        DistanceAndDirectionCalculator circleDistanceAndDirectionCalculator1 = new CircleDistanceAndDirectionCalculator(origin,point1);
        DistanceAndDirectionCalculator circleDistanceAndDirectionCalculator2 = new CircleDistanceAndDirectionCalculator(origin,point2);

        Assertions.assertEquals(Math.PI / 2, circleDistanceAndDirectionCalculator1.direction());
        Assertions.assertEquals(Math.PI / 2, circleDistanceAndDirectionCalculator2.direction());
    }
}
