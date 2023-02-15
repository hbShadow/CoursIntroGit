package org.oxyl;

import java.text.DecimalFormat;

import static java.lang.Math.*;

public class Triangle {
    private double x1, y1, x2, y2, x3, y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }
    public Triangle(){
        this(0.0,0.0,0.0,1.0,0.5,0.5);
    }
    public Triangle(Triangle triangle){
        this.x1 = triangle.getX1();
        this.x2 = triangle.getX2();
        this.x3 = triangle.getX3();
        this.y1 = triangle.getY1();
        this.y2 = triangle.getY2();
        this.y3 = triangle.getY3();
    }
    public void deplacer(double distanceX, double distanceY){
        this.x1 += distanceX;
        this.x2 += distanceX;
        this.x3 += distanceX;
        this.y1 += distanceY;
        this.y2 += distanceY;
        this.y3 += distanceY;
    }
    public void tourner(double theta){
        //coordonnées du barycentre
        double barycentreX = (this.x1 + this.x2 + this.x3)/3;
        double barycentreY = (this.y1 + this.y2 + this.y3)/3;

        //rayon entre barycentre et les differents pointd
        double r1 = calculerDistance(x1,y1,barycentreX,barycentreY);
        double r2 = calculerDistance(x2,y2,barycentreX,barycentreY);
        double r3 = calculerDistance(x3,y3,barycentreX,barycentreY);

        //angle actuel pour chaque point
        double angleActuel1 = atan2(this.y1 - barycentreY, this.x1 - barycentreX); /* * 180 / PI */
        double angleActuel2 = atan2(this.y2 - barycentreY, this.x2 - barycentreX);
        double angleActuel3 = atan2(this.y3 - barycentreY, this.x3 - barycentreX);

        //nouvelles positions
        this.x1 = Math.round((r1 * cos(angleActuel1 + theta / 180 * PI) + barycentreX) * 100.0) / 100.0;
        this.x2 = Math.round((r2 * cos(angleActuel2 + theta / 180 * PI) + barycentreX) * 100.0) / 100.0;
        this.x3 = Math.round((r3 * cos(angleActuel3 + theta / 180 * PI) + barycentreX) * 100.0) / 100.0;
        this.y1 = Math.round((r1 * sin(angleActuel1 + theta / 180 * PI) + barycentreY) * 100.0) / 100.0;
        this.y2 = Math.round((r2 * sin(angleActuel2 + theta / 180 * PI) + barycentreY) * 100.0) / 100.0;
        this.y3 = Math.round((r3 * sin(angleActuel3 + theta / 180 * PI) + barycentreY) * 100.0) / 100.0;
    }
    public boolean isEquilateral(){
        double x1y1y2x2 = round(sqrt(pow(this.x1-this.x2,2)+pow(this.y1-this.y2,2))*100);
        double x2y2x3y3 = round(sqrt(pow(this.x2-this.x3,2)+pow(this.y2-this.y3,2))*100);
        double x3y3x1y1 = round(sqrt(pow(this.x3-this.x1,2)+pow(this.y3-this.y1,2))*100);

        return x1y1y2x2 == x2y2x3y3 && x2y2x3y3 == x3y3x1y1;
    }

    private double calculerDistance(double x, double y, double barycentreX, double barycentreY){
        return sqrt(pow(x-barycentreX,2)+pow(y-barycentreY,2));
    }
    private double parseDoubleToTwoDecimal(double input){
        DecimalFormat df = new DecimalFormat("0.00");
        return Double.parseDouble(df.format(input));
    }


    //GETTER AND SETTER

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getY3() {
        return y3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }
}
