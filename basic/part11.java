import java.util.Scanner;

public class part11 {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.print("Enter a number: ");

          int num = input.nextInt();
          
          if(num % 2 == 0){
               System.out.println("Even Number of : "+num);

          }else{
               System.out.println("Odd Number of : "+num);

          }


     }
}
