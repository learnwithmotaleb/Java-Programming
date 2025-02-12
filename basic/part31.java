import java.util.Scanner;

public class part31 {
     public static void main(String[] args) {
          int sum = 0, r, temp, num;
          Scanner input = new Scanner(System.in);
          System.out.print("Enter a number: ");
          num = input.nextInt();
          temp = num;

          while(temp != 0){
               r = temp%10;
               sum = sum  *10 + r;
               temp = temp/10;
          }

          System.out.println("Reverse the of "+num+" : "+sum);

     }
}
