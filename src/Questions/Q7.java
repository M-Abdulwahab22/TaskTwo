package Questions;
import java.util.Scanner;

public class Q7 {
    public static void average() {
        Scanner s = new Scanner(System.in);
        double input = 0.0;
        double count = 0.0;
        double sum = 0.0;
       do{
           input = s.nextInt();

           if(input < 0.0)
           {
               break;
           }

           sum+= input;
           count++;

       }while(true);
      double avg = (double)(sum/count);
        System.out.println("average = " + avg);
    }
}
