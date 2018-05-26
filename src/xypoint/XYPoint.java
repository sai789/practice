package xypoint;

public class XYPoint {
    private double x,y;
    public XYPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distanceBetween(XYPoint xyPoint){
        double xSquare = Math.pow(xyPoint.x - x, 2);
        double ySquare = Math.pow(xyPoint.y - y, 2);
        return Math.sqrt(xSquare + ySquare);
    }
    public void movePointTo(XYPoint xyPoint){
        this.x = xyPoint.x;
        this.y = xyPoint.y;
    }
    public void moveByDistanceOne(XYPoint xyPoint){
        double slope = (xyPoint.y - y)/(xyPoint.x - x);
        double angle = Math.atan(slope);
        double angleInRadians = Math.toRadians(angle);
        double xDisplacement = Math.cos(angleInRadians);
        double yDisplacement = Math.sin(angleInRadians);
        double xValueAfterDisplacement = this.x + xDisplacement;
        double yValueAfterDisplacement = this.y + yDisplacement;

        this.x = xValueAfterDisplacement;
        this.y = yValueAfterDisplacement;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
