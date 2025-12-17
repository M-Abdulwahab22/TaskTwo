package Questions;

public class Q1 {
    public static void sum1To1000ForLoop()
    {
        int sum = 0;

        for(int i = 1; i <=1000;i++)
        {
            sum += i;
        }

        System.out.println("Sum of all numbers between 1 and 1000 using for loop = " + sum);
    }

    public static void sum1To1000WhileLoop()
    {
        int sum = 0;
        int i = 1;
        while(i <= 1000)
        {
            sum += i;
            i++;
        }

        System.out.println("Sum of all numbers between 1 and 1000 using while loop = " + sum);


    }

    public static void sum1To1000DoWhileLoop()
    {
        int sum = 0;
        int i = 1;
        do{
            sum += i;
            i++;
        }while(i <= 1000);

        System.out.println("Sum of all numbers between 1 and 1000 using do while loop = " + sum);
    }
}
