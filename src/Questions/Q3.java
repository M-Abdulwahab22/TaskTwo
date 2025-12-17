package Questions;

public class Q3 {
    public static void oddNumbersInRange(int a, int b)
   {
       int min = (a < b ? a : b);
       int max = (a > b ? a : b);

       System.out.print("odd numbers between " + min + " and "+max + " is :\t");
       for(int i = min; i <= max; i++)
       {
           if(i % 2 != 0)
           {
               System.out.print(i + "\t");

           }
       }

       System.out.println();
   }

    public static void numbersDivisibleBy5(int a , int b)
   {
       int min = (a < b ? a : b);
       int max = (a > b ? a : b);

       System.out.print("numbers divisible by 5 between " + min + " and "+max + " is :\t");
       for(int i = min; i <= max; i++)
       {
           if(i % 5 == 0)
           {
               System.out.print(i + "\t");

           }
       }

       System.out.println();


   }
}
