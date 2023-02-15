package org.oxyl;


public abstract class Polygone {

    private Point centre;


    public boolean isAuCentre(){
        return centre.getX() == 0.0 && centre.getY() == 0.0;
    }

    public abstract void tourner(double theta);

    public abstract void deplacer(double distanceX, double distanceY);

    public abstract int isPenche();

    //GETTERS AND SETTERS
    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }
}
