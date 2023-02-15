package org.oxyl;

import javax.naming.spi.ObjectFactoryBuilder;

import static java.lang.Math.*;
import static java.lang.Math.pow;

public class Point {

    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        this(0.0,0.0);
    }
    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
    }

    public boolean equals(Object o){
        if (o == this) {
            return true;
        }

        if (!(o instanceof Point)) {
            return false;
        }

        Point p = (Point) o;

        return Double.compare(x, p.x) == 0
                && Double.compare(y, p.y) == 0;
    }

    public double calculerDistance(Point point){
        double distance = sqrt(pow(this.x - point.x, 2) + pow(this.y - point.y, 2));
        return distance;
    }

    public void deplacer(double distanceX, double distanceY){
        this.x += distanceX;
        this.y += distanceY;
    }



    //GETTERS AND SETTERS

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
