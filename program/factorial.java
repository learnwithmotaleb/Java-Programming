import java.util.Scanner;

public class factorial {

     public static void main(String[] args) {
          // factorial program
          Scanner input = new Scanner(System.in);
          System.out.print("Enter any positive number: ");
          int n = input.nextInt();
          int fact = 1;

          for (int i = n; i >= 1; i--) {
               fact = fact * i;

          }

          System.out.println("Factorial of "+ n +" = "+fact);
     }
}