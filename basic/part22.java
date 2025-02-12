import java.util.Scanner;

public class part22 {
     public static void main(String[] args) {

          int m, n;
          Scanner input = new Scanner(System.in);

          System.out.print("Enter initial number: ");
          m = input.nextInt();

          System.out.print("Enter final number: ");
          n = input.nextInt();
          int sum = 0;
          for(int i = m; i<=n; i = i+1 ){
               sum = sum + i*i;
               System.out.print(i+"*"+i+" ");
          }
          System.out.println();
          System.out.println("Sum of : "+ sum);
          
     }
}
