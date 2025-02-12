import java.util.Scanner;

public class timetable {
     public static void main(String[] args) {

          Scanner input = new Scanner(System.in);
          System.out.print("Enter initial number: ");
          int n = input.nextInt();

          System.out.print("Enter final number: ");
          int m = input.nextInt();

          for(int i = n; i<=m; i++){
              
               for(int j = 1; j<=10; j++){
                    System.out.println(i + " X "+j+ " = "+i*j);

               }
               System.out.println();
          }


          
     }
}
