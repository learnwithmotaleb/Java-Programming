import java.util.Scanner;

public class part41 {
     public static void main(String[] args) {

          int[][] A = new int[2][3];
          int[][] B = new int[2][3];
          int[][] c = new int[2][3];

          Scanner input = new Scanner(System.in);

          // for a matrix
          for (int row = 0; row < 2; row++) {
               for (int cols = 0; cols < 3; cols++) {
                    System.out.printf("Enter A matrix: [%d][%d] ",row,cols);
                    A[row][cols] = input.nextInt();
               }
          }
          System.out.println();

          // for b matrix
          for (int row = 0; row < 2; row++) {
               for (int cols = 0; cols < 3; cols++) {
                    System.out.printf("Enter B matrix: [%d][%d] ",row,cols);
                    B[row][cols] = input.nextInt();
               }
          }
          System.out.println();

          // for a output matrix
          System.out.println("A Matix: \t");
          for (int row = 0; row < 2; row++) {
               for (int cols = 0; cols < 3; cols++) {

                    System.out.print(A[row][cols] + " ");

               }
               System.out.println();
          }
          System.out.println();

          // for b output matrix
          System.out.println("B Matix: \t");
          for (int row = 0; row < 2; row++) {
               for (int cols = 0; cols < 3; cols++) {

                    System.out.print(B[row][cols] + " ");

               }
               System.out.println();
          }
          System.out.println();

          // for A+B output matrix
          System.out.println("A + B Matix: \t");
          for (int row = 0; row < 2; row++) {
               for (int cols = 0; cols < 3; cols++) {

                    c[row][cols] = A[row][cols] +B[row][cols];
                    System.out.print(c[row][cols]+ " ");

                   // System.out.print((A[row][cols] +B[row][cols]) + " ");

               }
               System.out.println();
          }
     }
}
