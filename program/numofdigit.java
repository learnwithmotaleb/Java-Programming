import java.util.Scanner;

public class numofdigit {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          int sum = 0,remainder,num,temp;

          System.out.print("Enter positive number: ");
          num = input. nextInt();

          temp = num;

          while (temp != 0) {
               remainder = temp%10;
          sum = sum + remainder;
          temp = temp/10;
               
          }

          System.out.println("sum of number: "+ sum);

          


          


     }
}
