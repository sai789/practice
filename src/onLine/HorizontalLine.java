package onLine;

public class HorizontalLine implements Line {
    private Point yP;
    public HorizontalLine(double y) {
        yP = new Point(0, y);
    }

    @Override
    public boolean contains(Point p) {
        return p.y == this.yP.y;
    }
}
