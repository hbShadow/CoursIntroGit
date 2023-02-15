package org.oxyl;

public class CercleAvecPoint {
    private double rayon;
    private Point centre;

    public CercleAvecPoint(Point centre, double rayon) {
        this.centre = centre;
        setRayon(rayon);
    }
    public CercleAvecPoint(){
        this(new Point(),1.0);
    }
    public CercleAvecPoint(CercleAvecPoint cercleAvecPoint){
        this.rayon = cercleAvecPoint.getRayon();
        this.centre = cercleAvecPoint.getCentre();

    }

    public void deplacer(double distanceX, double distanceY){
        this.centre.deplacer(distanceX,distanceY);
    }

    public boolean isGrand()
    {
        return rayon>100.0;
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

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point p) {
        this.centre = p;
    }
}
