import java.util.Scanner;

public class part27 {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          System.out.print("Enter initial number: ");
          int m = input.nextInt();

          System.out.print("Enter final number: ");
          int n = input.nextInt();

          int count = 0;
          int totalPrimeNumber = 0;

          for(int i = m; i<=n; i++){
               for (int j = 2; j<=i-1; j++) {

                    if (i % j == 0) {

                         count++;
                         break;
                    }

               }
               if (count == 0){
                    System.out.print(i+" ");
                    totalPrimeNumber++;

               }
               count=0;
                 
                 
     
               
            
          }
          System.out.println();
          System.out.println("Total prime number: "+totalPrimeNumber);

    

     }
}
