package Questions;

public class Q2 {
    static public void evenNumbers1To50()
    {
        System.out.print("even numbers between 1 and 50 are :\t");
        for (int i = 1; i <= 50; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i + "\t");
            }
        }

        System.out.println();
    }

    static public void oddNumbers1To50()
    {
        System.out.print("odd numbers between 1 and 50 are :\t");

        for (int i = 1; i <= 50; i++)
        {
            if(i % 2 == 1)
            {
                System.out.print(i + "\t");
            }
        }

        System.out.println();
    }

}
