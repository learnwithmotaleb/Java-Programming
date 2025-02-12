import java.util.Scanner;

public class part38 {
     public static void main(String[] args) {

          Scanner input = new Scanner(System.in);
          System.out.print("Enter five number: ");
          double[] numbers = new double[5];

          // input here===============
          for (int i = 0; i < numbers.length; i++) {
               numbers[i] = input.nextDouble();
          }

          double sum = 0;
          // output here================
          for (int i = 0; i < numbers.length; i++) {
               sum = sum + numbers[i];
          }
          System.out.println("Sum of the array all element: " + sum);

          // ======average of the array=========
          double avg = sum / numbers.length;
          System.out.println("Average the array : " + avg);

          double max = numbers[0];
          double min = numbers[0];
          for (int i = 1; i < numbers.length; i++) {
               // ==========Maximum============
               if (max < numbers[i]) {

                    max = numbers[i];

               }
               // ==========Minumum============
               if (min > numbers[i]) {

                    min = numbers[i];

               }
          }
          System.out.println("Maximum the array : " + max);
          System.out.println("Minimum the array : " + min);

     }
}
