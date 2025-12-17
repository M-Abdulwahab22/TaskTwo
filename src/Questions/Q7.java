package Questions;
import java.util.Scanner;

public class Q7 {
    static public void average() {
        Scanner s = new Scanner(System.in);
        int input = 0;
        int count = 0;
        int sum = 0;
       do{
           input = s.nextInt();

           if(input < 0)
           {
               break;
           }

           sum+= input;
           count++;

       }while(input >= 0);
      double avg = (double)(sum/count);
        System.out.println("average = " + sum / count);
    }
}
