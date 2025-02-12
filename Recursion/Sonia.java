import java.util.Scanner;

public class Sonia {

     public static void main(String[] args) {

          Scanner input = new Scanner(System.in);
          System.out.print("Enter a number: ");
          int n = input.nextInt();

          Motaleb motaleb = new Motaleb();

     
          System.out.println("Factorial of "+n+" : "+motaleb.fact(n));

     }
}