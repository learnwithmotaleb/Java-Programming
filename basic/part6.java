import java.util.Scanner;

public class part6 {
     public static void main(String[] args) {
          double r, area;
          Scanner input = new Scanner(System.in);
          System.out.print("Enter radius: ");
          r = input.nextDouble();
        
          area = 14.1416 * r * r;
          System.out.println("Circle of area: " + area);

     }
}
