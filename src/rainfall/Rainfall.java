package rainfall;

public class Rainfall
{
    private double[] rain; // Array of rainfall data

    /**
     * Constructor
     */

    public Rainfall(double r[])
    {
        // Create a new array.
        rain = new double[r.length];

        // Copy the argument's elements to the
        // new array.
        for (int i=0;i<r.length;i++) {
            if (r[i] < 0)
                throw new RuntimeException("Rainfall cannot be negative");
            rain[i] = r[i];
        }

    }

    /**
     * getTotalRainFall method
     */

    public double getTotalRainFall()
    {
        double total = 0.0;  // Accumulator
        for (double rainfall: rain) {
            total += rainfall;
        }
        return total;
    }

    /**
     * getAverageRainFall method
     */

    public double getAverageRainFall()
    {
        return getTotalRainFall()/rain.length;
    }

    /**
     * getHighestMonth method
     */

    public int getHighestMonth()
    {
        int maxMonthIndex = 0;
        for(int i=1;i<rain.length;i++)
        {
            if (rain[maxMonthIndex]<rain[i])
                maxMonthIndex = i;
        }
        return maxMonthIndex;
    }

    /**
     * getLowestMonth method
     */

    public int getLowestMonth()
    {
        int minMonthIndex = 0;
        for(int i=1;i<rain.length;i++)
        {
            if (rain[minMonthIndex]>rain[i])
                minMonthIndex = i;
        }
        return minMonthIndex;
    }

    /**
     * getRainAt method
     * Returns the value in the specified array
     * element.
     */

    public double getRainAt(int e)
    {
        return rain[e];
    }
}
