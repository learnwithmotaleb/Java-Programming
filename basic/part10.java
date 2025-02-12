import java.util.Scanner;

public class part10 {
     public static void main(String[] args) {
          // controll statement
          // selection, iteration/looping,jump
          // selection controll statement if else,switch
          // iteration/looping, for, do-while, while,
          // jump, break, continue,return

          // today i will discorsion of slection statement of if else switch

          // int x = 11;
          // if(x%2==0 ){
          // System.out.println("event");
          // }else{
          // System.out.println("odd");
          // }

          Scanner input = new Scanner(System.in);
          System.out.print("Enter a number: ");
          int num = input.nextInt();

          if (num > 0) {
               System.out.println("Positive");
          } else if (num < 0) {
               System.out.println("Nagetive");
          } else {
               System.out.println("Zero");
          }

     }
}
