package Questions;

public class Q6 {
    static public void primeNumber (int n)
    {
      boolean isPrime = true;

      for(int i = 2; i * i <= n; i++)
      {
          if(n % i == 0)
          {
              isPrime = false;
              break;

          }
      }

      System.out.println(isPrime == true ? n + " is a prime number" : n + " is not a prime number!");
    }
}
