import java.util.Scanner;

public class part26 {
     public static void main(String[] args) {

          Scanner input = new Scanner(System.in);
          System.out.print("Enter a positive number: ");
          int n = input.nextInt();
          int count = 0;

          for (int i = 2; i < n; i++) {
               if (n % i == 0) {
                    count++;
                    break;
               }

          }
          if (count == 0) {
               System.out.println("Prime number of " + n + " ");
          } else {
               System.out.println("Not Prime number of " + n + " ");

          }

     }
}
