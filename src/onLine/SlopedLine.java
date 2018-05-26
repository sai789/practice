package onLine;

public class SlopedLine implements Line {
    private Point point1;
    private Point point2;
    private double slope;
    private double intercept;
    public SlopedLine(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
        slope = (point2.y-point1.y)/(point2.x-point1.x);
        intercept = point1.y - (point1.x*slope);
    }

    @Override
    public boolean contains(Point p) {
        return 0.01>=Math.abs((p.y - (p.x*slope)) - intercept);
    }
}
