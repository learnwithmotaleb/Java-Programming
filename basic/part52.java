import java.util.Scanner;

public class part52 {
     public static void main(String[] args) {
          Scanner input =new Scanner(System.in);

          System.out.print("Enter your name: ");
          
     String s1 = input.nextLine();

     StringBuffer name = new StringBuffer(s1);
     String s2 = name.reverse().toString();

     System.out.println(s1);
     System.out.println(name);
     if(s1.equals(s2)){
          System.out.println("Palindrome!");
     }else{
          System.out.println("Not Palindrome!");

     }

     


     }
}
