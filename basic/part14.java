import java.util.Scanner;

public class part14 {
     public static void main(String[] args) {
          //logical operator
          Scanner input = new Scanner(System.in);
          System.out.print("Enter a Charactar: ");
          char ch = input.next().charAt(0);
          if(ch >= 'A' && ch <= 'Z'){
               System.out.println("Capital Letter: "+ch);
          }
          else if(ch >= 'a' && ch <= 'z'){
               System.out.println("Small Letter: "+ch);

          }
          else{
               System.out.println("Not Letter!! Please try again");
          }

     }
}
