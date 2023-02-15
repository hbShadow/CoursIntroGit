package org.oxyl;

import java.text.DecimalFormat;

import static java.lang.Math.*;


public class TriangleAvecPoint extends Polygone{

    private Point point1, point2, point3;

    public TriangleAvecPoint(Point point1, Point point2, Point point3){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public TriangleAvecPoint(){
        this(new Point(),new Point(0.0,1.0), new Point(0.5,0.5));
    }
    public TriangleAvecPoint(TriangleAvecPoint triangle) {
        this(triangle.point1, triangle.point2, triangle.point3);
    }

    @Override
    public void deplacer(double distanceX, double distanceY){
        point1.deplacer(distanceX, distanceY);
        point2.deplacer(distanceX, distanceY);
        point3.deplacer(distanceX, distanceY);

    }

    @Override
    public void tourner(double theta){
        //coordonnées du barycentre
        Point barycentre = barycentre(point1, point2, point3);

        point1 = tournerPoint(point1,theta,barycentre);
        point2 = tournerPoint(point2,theta,barycentre);
        point3 = tournerPoint(point3,theta,barycentre);
    }

    @Override
    public int isPenche() {
        return 0;
    }

    @Override
    public boolean isAuCentre() {
        return super.isAuCentre();
    }

    public boolean isEquilateral(){
        double d1 = round(point1.calculerDistance(point2) * 100) / 100.0;
        double d2 = round(point2.calculerDistance(point3) * 100) / 100.0;
        double d3 = round(point3.calculerDistance(point1) * 100) / 100.0;

        return d1 == d2 && d2 == d3;
    }

    private Point barycentre(Point p1, Point p2, Point p3){
        return new Point((p1.getX() + p2.getX() + p3.getX()) / 3,(p1.getY() + p2.getY() + p3.getY()) / 3);
    }

    private double calculerAngle(Point p, Point barycentre){
        return atan2(p.getY() - barycentre.getY(), p.getX() - barycentre.getX());
    }

    private Point tournerPoint(Point p, double theta, Point barycentre){
        double currentAngle = calculerAngle(p, barycentre);
        double r = p.calculerDistance(barycentre);
        //nouvelle coordonnée apres rotation
        double x = round((r * Math.cos(theta / 180 * PI + currentAngle) + barycentre.getX()) * 100) / 100.0;
        double y = round((r * Math.sin(theta / 180 * PI + currentAngle) + barycentre.getY()) * 100) / 100.0;

        return new Point(x,y);
    }

    private double parseDoubleToTwoDecimal(double input){
        DecimalFormat df = new DecimalFormat("0.00");
        return Double.parseDouble(df.format(input));
    }

    //GETTER AND SETTER

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }


}
