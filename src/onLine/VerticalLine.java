package onLine;

public class VerticalLine implements Line {
    private Point xP;
    public VerticalLine(double x) {
        xP = new Point(x, 0);
    }

    @Override
    public boolean contains(Point p) {
        return p.x == this.xP.x;
    }
}
