import java.util.Scanner;

public class part54 {
     public static void main(String[] args) {

          Scanner input = new Scanner(System.in);
          System.out.print("Enter a dicimal value: ");
          int decimal = input.nextInt();

          System.out.println("The Decimal : " + decimal);

          String binary = Integer.toBinaryString(decimal);
          System.out.println("The Binary : " + binary);

          String hex = Integer.toHexString(decimal);
          System.out.println("The HexaDecimal : " + hex.toUpperCase());

          String otal = Integer.toOctalString(decimal);
          System.out.println("The Octal : " + otal);

     }
}
