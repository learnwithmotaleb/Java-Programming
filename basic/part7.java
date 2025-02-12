import java.util.Scanner;

public class part7 {
   public static void main(String [] args){

     //tempurature convert
     double cels, fair, area;

     Scanner input = new Scanner(System.in);
     // System.out.print("Enter Celsius: ");
     // cels = input.nextDouble();

     // fair = 1.8 *(cels+32);
     // System.out.println("Celsius To Fairhantheit: "+fair);

     System.out.print("Enter Fair: ");
     fair = input.nextDouble();
     
     cels = 0.6 *(fair-32);
     System.out.println("Fairheint To Celcius: "+cels);


     


   }

}
