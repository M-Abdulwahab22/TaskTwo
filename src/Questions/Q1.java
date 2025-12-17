package Questions;

public class Q1 {
    static public void sum1To1000ForLoop()
    {
        int sum = 0;

        for(int i = 1; i <=1000;i++)
        {
            sum += i;
        }

        System.out.println("Sum of all numbers between 1 and 1000 using for loop = " + sum);
    }
}
