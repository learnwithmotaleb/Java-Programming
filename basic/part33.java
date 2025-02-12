import java.util.Scanner;

public class part33 {
     public static void main(String[] args) {
          int sum = 0, r, temp, num;
          Scanner input = new Scanner(System.in);

          System.out.print("Enter a number: ");

          num = input.nextInt();
          temp = num;

          while(temp != 0){
               r = temp % 10;
               sum = sum + r*r*r;
               temp = temp/10;
          }
          if(num == sum){
               System.out.println("Armstrong number");
          }else{
               System.out.println("Not Armstrong number");
          }



     }
}
