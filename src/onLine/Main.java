package onLine;

public class Main {
    public static void main(String[] args) {
        Line line = makeLine(new Point(2.0,3), new Point(3,4));
        System.out.println("Is (4,5) on (2,3) and (3,4) line? :"+line.contains(new Point(4,5)));
    }
    static Line makeLine(Point p1, Point p2) {
        Line ret;
        if (p1.x == p2.x) {
            ret = new VerticalLine(p1.x);
        }
        else if (p1.y == p2.y) {
            ret = new HorizontalLine(p1.y);
        }
        else {
            ret = new SlopedLine(p1, p2);
        }
        return ret;
    }
}
