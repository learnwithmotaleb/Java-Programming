import java.util.Scanner;

public class part13 {
     public static void main(String[] args) {

          //Logical Operator
          //&& Logical AND
          //|| Logical OR
          // ! Logical NOT

          Scanner input = new Scanner(System.in);
          System.out.print("Enter a number: ");
          char ch = input.next().charAt(0);

          if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u' ){
               System.out.println("Vowel is "+ch);
          }else{
               System.out.println("Consonent is "+ ch);
          }


          
     }
}
