package Questions;

public class Q4 {
    public static void seriesValue(int n)
    {
        int sum = 0;

        for(int i = 1; i <= n; i++)
        {
            sum += (i*i*i);
        }

        System.out.println("The " + n + " series sum =\t" + sum);
    }
}
