import java.util.Scanner;

public class part24 {
     public static void main(String[] args) {
          //factorial 
          //5! = 120=== 5x4x3x2x1
           //4! = 24=== 4x3x2x1
           //3! = 6=== 3x2x1
           //2! = 2=== 2x1
           //1! = 1=== 1

           Scanner input = new Scanner(System.in);
           System.out.print("Enter any positive integer: ");
           int n = input.nextInt();
           int fact = 1;

           for(int i = n; i >=1; i--){
               fact = fact * i;
               System.out.print(i+ " ");


           }
           System.out.println();
           System.out.println("Factorial of "+n+"!"+" : "+ fact);



     }
}
