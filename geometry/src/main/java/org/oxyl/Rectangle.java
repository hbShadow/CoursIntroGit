package org.oxyl;

public class Rectangle {

    private double centreX, centreY, longueur, largeur, angle;

    public Rectangle(double centreX, double centreY, double longueur, double largeur, double angle) {
        this.centreX = centreX;
        this.centreY = centreY;
        setLongueur(longueur);
        setLargeur(largeur);
        this.angle = angle;
    }
    public Rectangle(){
        this(0.0, 0.0, 1.0, 1.0, 0.0);
    }
    public Rectangle(Rectangle rectangle){
        this.centreY = rectangle.getCentreY();
        this.centreX = rectangle.getCentreX();
        this.longueur = rectangle.getLongueur();
        this.largeur = rectangle.getLargeur();
        this.angle = rectangle.getAngle();
    }

    public void deplacer(double distanceX, double distanceY){
        this.centreX+=distanceX;
        this.centreY+=distanceY;
    }

    public boolean isCarre(){
        return this.largeur == this.longueur;
    }

    public void redimensionner(double lambda){
        if (lambda<0){
            this.largeur = 0;
            this.longueur = 0;
        }else{
            this.largeur *= lambda;
            this.longueur *= lambda;
        }
    }

    public void tourner(double theta){
        this.angle += theta;
    }

    //GETTER AND SETTER

    public double getCentreX() {
        return centreX;
    }

    public void setCentreX(double centreX) {
        this.centreX = centreX;
    }

    public double getCentreY() {
        return centreY;
    }

    public void setCentreY(double centreY) {
        this.centreY = centreY;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        if (longueur<0){
            this.longueur = 0;
        }else{
            this.longueur = longueur;
        }
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        if (largeur<0){
            this.largeur = 0;
        }else{
            this.largeur = largeur;
        }
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }
}
