import java.util.Scanner;

public class part23 {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          System.out.print("Enter initial number: ");

          int m = input.nextInt();
          System.out.print("Enter final number: ");
          int n = input.nextInt();
          int sum = 1;


          for(int i = m; i<=n; i=i+1){
               sum = sum *i;
               System.out.print(i+" ");
          }
          System.out.println();
          System.out.println("Sum of : "+sum);

     }
}
