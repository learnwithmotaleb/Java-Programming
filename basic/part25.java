import java.util.Scanner;

public class part25 {
     public static void main(String[] args) {
          //time table
          Scanner input = new Scanner(System.in);
          System.out.print("Enter initial number: ");
          int m = input.nextInt();

          System.out.print("Enter final number: ");
          int n = input.nextInt();

          for(int i = m; i<=n; i++){

               for(int x = 1; x<=10; x++){

                    System.out.println(i+" x "+x+" = "+i*x);

               }
               System.out.println("\n");

            

          }
          System.out.println();
          
     }
}
