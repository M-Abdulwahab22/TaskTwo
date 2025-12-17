package Questions;

public class Q5 {
    static public void factorial(int n)
    {
        int f = 1;
        for(int i = n; i > 0; i--)
        {
            f *= i;
        }

        System.out.println("factorial of " + n + " is =\t" + f);
    }
}
