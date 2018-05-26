package rainfall;

public class RainfallDemo
{
    public static void main(String[] args)
    {
        // Array with this year's rainfall data
        double[] thisYear = {1.6, -2.1, 1.7, 3.5, 2.6, 3.7,
                3.9, 2.6, 2.9, 4.3, 2.4, 3.7 };

        int high;   // To hold the month with the highest amount
        int low;    // To hold the month with the lowest amount

        // Create a Rainfall object initialized with
        // this year's data.
        Rainfall r = new Rainfall(thisYear);

        // Display the total rainfall.
        System.out.println("The total rainfall for this year is " +
                r.getTotalRainFall());

        // Display the average rainfall.
        System.out.println("The average rainfall for this year is " +
                r.getAverageRainFall());

        // Get and display the month with the highest rainfall.
        high = r.getHighestMonth();
        System.out.println("The month with the highest amount of rain " +
                "is " + (high+1) + " with " + r.getRainAt(high) +
                " inches.");

        // Get and display the month with the lowest rainfall.
        low = r.getLowestMonth();
        System.out.println("The month with the lowest amount of rain " +
                "is " + (low+1) + " with " + r.getRainAt(low) +
                " inches.");
    }
}