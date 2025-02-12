import java.util.Scanner;

public class part21 {
     public static void main(String[] args) {
          int n,m;
          Scanner input = new Scanner(System.in);

          System.out.print("Enter initial number: ");
          m = input.nextInt();

          System.out.print("Enter final number: ");
          n = input.nextInt();

          int sum = 0;
          int i;
       

          for(i = m; i<= n; i++){
               if(i%2!=0){
                    sum = sum + i;
                    System.out.print(i+" ");
               }
              
          }
          System.out.println();
           
          System.out.println("Sum of event number = "+sum);
          

     }
}
