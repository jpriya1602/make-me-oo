package org.oop;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

   /*
    --if 3d point is used,then we are able to add z as the attribute.
    private double z;
    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
  */
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


}
