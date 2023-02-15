package org.oxyl;


public class Cercle {

    private double centreX,centreY,rayon;
    public Cercle(double centreX,double centreY,double rayon) {
        this.centreX=centreX;
        this.centreY=centreY;
        setRayon(rayon);
    }
    public Cercle(){
        this(0.0,0.0,1.0);
    }
    public Cercle(Cercle cercle){
        this.rayon = cercle.getRayon();
        this.centreY = cercle.getCentreY();
        this.centreX = cercle.getCentreX();
    }

    public void deplacer(double distanceX, double distanceY){
        this.centreX+=distanceX;
        this.centreY+=distanceY;
    }

    public boolean isGrand()
    {
        if (this.rayon>100.0)
            return true;
        return false;
    }

    public void redimensionner(double lambda){
        if (lambda < 0){
            this.rayon = 0;
        }else{
            this.rayon *= lambda;
        }

    }

    public void tourner(double theta){
    }

//GETTER AND SETTER
    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon){
        if (rayon<0)
        {
            this.rayon = 0;
        }else
        {
            this.rayon = rayon;
        }
    }

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


    public String toString() {
        return "centreX : " + this.centreX + "; centreY : " + this.centreY + "; Rayon : " + this.rayon;
    }
}