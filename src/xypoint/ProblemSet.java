package xypoint;

public class ProblemSet {
    public static void main(String[] args) {
        XYPoint firstXyPoint = new XYPoint(0,0);
        System.out.println("Point before move: "+firstXyPoint);
        XYPoint firstCopyXyPoint = new XYPoint(0,0);
        XYPoint secondXyPoint = new XYPoint(3,3);

        agro(firstXyPoint, secondXyPoint);
        System.out.println("Point after move: "+firstXyPoint);
        System.out.println("Other point: "+secondXyPoint);
        System.out.println("Distance between point(before move) and point(after move): "+ firstXyPoint.distanceBetween(firstCopyXyPoint));
    }
    public static void agro(XYPoint xyPoint1, XYPoint xyPoint2){
        double distance = xyPoint1.distanceBetween(xyPoint2);
        System.out.println("Distance: "+distance);
        if(distance < 1){
            xyPoint2.movePointTo(xyPoint1);
            return;
        }
        xyPoint1.moveByDistanceOne(xyPoint2);
    }
}
