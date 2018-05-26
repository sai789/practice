package arraysum;

public class ArraySum {
    public static void main(String[] args) {
        //initialize col and row sizes
        int MAX_ROW = 3,MAX_COL = 5;
        //declare 2D array with the above sizes
        int numbers[][] = new int[MAX_ROW][MAX_COL];
        //assign the values to 2D array
        numbers[0] = new int[]{1,2,3,4,5};
        numbers[1] = new int[]{6,7,8,9,10};
        numbers[2] = new int[]{1,2,3,4,5};

        //ask the sum to print
        sum(numbers);
    }

    //sums up all the numbers in 2D array and prints
    private static void sum(int[][] numbers) {
        int sum = 0;
        for (int i=0;i<numbers.length;i++)
            for (int j=0;j<numbers[i].length;j++)
                sum += numbers[i][j];
        System.out.println("2D array sum = "+sum);
    }
}
