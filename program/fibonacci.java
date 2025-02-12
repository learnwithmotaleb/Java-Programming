import java.util.Scanner;

public class fibonacci {
     public static void main(String[] args) {

          int first = 0, second =1, fibo;

          Scanner input = new Scanner(System.in);
          System.out.print("Enter last number: ");
          int num = input.nextInt();

     
     


          for(int i=3; i<=num; i++){

               fibo = first + second;
               System.out.println(" "+fibo);
               first = second;
               second = fibo;

          

          }

          System.out.println("");

     }
}
