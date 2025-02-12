import java.util.Scanner;

public class part37 {
     public static void main(String[] args) {

          Scanner input = new Scanner(System.in);
          double[] number = new double[5];
          System.out.print("Please enter 5 number: ");
          
          // input here
          for (int i = 0; i < number.length; i++) {
               number[i] = input.nextDouble();
          }

          // sum here
          double sum = 0;
          for (int i = 0; i < number.length; i++) {
               sum = sum + number[i];
          }

          //average
          double avg = sum/number.length;

          System.out.println("Sum of array: " + sum);
          System.out.println("Average of array: " + avg);

     }
}
