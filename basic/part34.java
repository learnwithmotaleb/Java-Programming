import java.util.Scanner;

public class part34 {
     public static void main(String[] args) {
          //pattern
          Scanner input =new Scanner(System.in);
          System.out.print("Please enter line number: ");
          int n = input.nextInt();

          for(int row = 1; row<=n; row++){

               for(int col=1; col <=row; col++ ){

                    System.out.print(col+" ");

               }
               System.out.println();
          }
     }
}
