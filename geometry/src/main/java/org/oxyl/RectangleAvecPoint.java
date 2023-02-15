package org.oxyl;

public class RectangleAvecPoint {
    private double longueur, largeur, angle;
    private Point centre = new Point();

    public RectangleAvecPoint(Point centre, double longueur, double largeur, double angle) {
        this.centre = centre;
        setLongueur(longueur);
        setLargeur(largeur);
        this.angle = angle;
    }
    public RectangleAvecPoint(){
        this(new Point(), 1.0, 1.0, 0.0);
    }
    public RectangleAvecPoint(RectangleAvecPoint RectangleAvecPoint){
        this.centre = RectangleAvecPoint.getCentre();
        this.longueur = RectangleAvecPoint.getLongueur();
        this.largeur = RectangleAvecPoint.getLargeur();
        this.angle = RectangleAvecPoint.getAngle();
    }

    public void deplacer(double distanceX, double distanceY){
        centre.deplacer(distanceX,distanceY);
    }

    public boolean isCarre(){
        return largeur == longueur;
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

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
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

}

