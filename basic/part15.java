import java.util.Scanner;

public class part15 {
     public static void main(String[] args) {

          int digit;
          Scanner input = new Scanner(System.in);
          System.out.print("Enter a digit 1 to 9: ");
          digit = input.nextInt();

          switch (digit) {
               case 1:
                    System.out.println("One : " + digit);

                    break;
               case 2:
                    System.out.println("Two : " + digit);

                    break;
               case 3:
                    System.out.println("Three : " + digit);

                    break;
               case 4:
                    System.out.println("Four : " + digit);

                    break;
               case 5:
                    System.out.println("Five : " + digit);

                    break;
               case 6:
                    System.out.println("Six : " + digit);

                    break;
               case 7:
                    System.out.println("Seven : " + digit);

                    break;
               case 8:
                    System.out.println("Eight : " + digit);

                    break;
               case 9:
                    System.out.println("Nice : " + digit);

                    break;

               default:
                    System.out.println("Invalid Number! Please try again.");

                    break;
          }

     }
}
