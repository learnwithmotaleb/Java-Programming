import java.util.Scanner;

public class reversenumber {
     public static void main(String[] args) {
          int num, reaminder, reverseNum = 1, temp;
          Scanner input = new Scanner(System.in);
          System.out.print("Enter a positive number: ");
          num = input.nextInt();

          temp = num;
          while (temp != 0) {

               reaminder = num % 10;
               reverseNum = reverseNum * 10 + reaminder;
               temp = temp / 10;

          }

          System.out.println("Reverse Number Of "+ reverseNum);

     }
}
