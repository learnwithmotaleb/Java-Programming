import java.util.Scanner;

public class part32 {
     public static void main(String[] args) {

          int sum = 0, r, temp, num;
          Scanner input = new Scanner(System.in);
          System.out.print("Enter a number: ");
          num = input.nextInt();
          temp = num;

          while(temp != 0){
               r = temp % 10;
               sum = sum * 10 + r;
               temp = temp /10;
     
          }
          if(num == sum){
               System.out.println("Plindrom Number");
          }else{
               System.out.println("Not Plaindrom Number");
          }
        

          
     }
}
