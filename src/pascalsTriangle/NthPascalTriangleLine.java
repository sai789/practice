package pascalsTriangle;

import java.util.Arrays;
import java.util.Scanner;

public class NthPascalTriangleLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int lineNumber = scanner.nextInt();
        if(lineNumber > 15){
            System.out.println("Maximum number can be 15 only!");
            System.exit(0);
        }
        int[] nthLine = new int[]{1};
        for (int i=1;i<lineNumber;i++){
            nthLine = nextPascalLine(nthLine);
        }

        System.out.println(Arrays.toString(nthLine));
    }

    private static int[] nextPascalLine(int[] nthLine) {
        int[] nLine = new int[nthLine.length+1];
        nLine[0] = 1;

        nLine[nthLine.length] = 1;

        for (int i = 1; i <= nthLine.length / 2; i++) {
            nLine[i] += nthLine[i] + nthLine[i - 1];
        }

        for (int i = 1; i <= nLine.length / 2; i++) {
            nLine[nLine.length-1-i] = nLine[i];
        }

        return nLine;
    }
}
