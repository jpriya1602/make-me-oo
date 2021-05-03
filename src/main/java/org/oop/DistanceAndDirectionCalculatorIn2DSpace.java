package org.oop;

public class DistanceAndDirectionCalculatorIn2DSpace implements DistanceAndDirectionCalculator{

    Point from,to;
    private double xDistance;
    private double yDistance;

    public DistanceAndDirectionCalculatorIn2DSpace(Point from, Point to){
        this.from = from;
        this.to = to;
    }
    private void calculateXAndYDistance(){
        this.xDistance = to.getX() - from.getX();
        this.yDistance = to.getY() - from.getY();
    }
    public double distance() {
        calculateXAndYDistance();
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double direction() {
        calculateXAndYDistance();
        return Math.atan2(yDistance, xDistance);
    }
}
