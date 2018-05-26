package builder;

import java.util.Scanner;
public class Lab7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the builder: ");
        Builder builder = new Builder(scanner.nextLine());
        System.out.println("The name of builder is: "+ builder.getName());
        System.out.println("Enter a positive integer: ");
        int positive = Integer.parseInt(scanner.nextLine());
        System.out.println(builder.makeRow(positive, "=") + builder.makeRow(positive, "*") + builder.makeRow(positive, "="));
        System.out.println("Enter a positive odd integer,");
        System.out.println("representing number of stars in the base of pyramid :");
        builder.makePyramid(Integer.parseInt(scanner.nextLine()), "*");
    }
}
