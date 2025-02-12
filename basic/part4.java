import java.util.Scanner;

public class part4 {
     public static void main(String[] args) {
          int num1, num2, result;

          Scanner input = new Scanner(System.in);
          System.out.print("Enter num 1: ");
          num1 = input.nextInt();
          System.out.print("Enter num 2: ");
          num2 = input.nextInt();

          result = num1 + num2;
          System.out.println("Sum = " + result);

          result = num1 - num2;
          System.out.println("sub = " + result);

          result = num1 * num2;
          System.out.println("intu = " + result);

          result = num1 / num2;
          System.out.println("divition = " + result);

          result = num1 % num2;
          System.out.println("modulus = " + result);

     }
}
