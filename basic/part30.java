import java.util.Scanner;

public class part30 {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.print("Enter number: ");
          int n = input.nextInt();
          int r;
          int temp = n;
          int sum = 0;

          while(temp!=0){
               r = temp%10;
               sum = sum + r;
               temp = temp/10;
          }
          System.out.println("Sume of "+n+" : "+sum);


         

          


          
     }
}
