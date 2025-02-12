import java.util.Scanner;

public class dowhitle2 {
     public static void main(String[] args) {

          Scanner input = new Scanner(System.in);
          int n;
          int s = 0;
          int c = 0;

          do {
               System.out.print("Please Enter value or exit press -1: ");
               n = input.nextInt();

               if (n != -1) {
                    s += n;
                    c++;

               }

          } while (n != -1);

          System.out.println("S OF Value " + s);
          System.out.println("C OF Value " + c);
          double avarage = (double) s / c;
          System.out.println("The avarage value: " + avarage);

          // close the object of
          input.close();

     }
}
