public class part42 {
     public static void main(String[] args) {

          int[][] number = new int[4][];

          number[0] = new int[1];
          number[1] = new int[2];
          number[2] = new int[3];
          number[3] = new int[4];
          int k = 0;

          for (int row = 0; row < 4; row++) {

               for (int cols = 0; cols < row + 1; cols++) {
                    number[row][cols] = k;
                    k++;

               }

          }

          for (int row = 0; row < 4; row++) {

               for (int cols = 0; cols < row+1; cols++) {

                    System.out.print(number[row][cols] + " ");

               }
               System.out.println();

          }

     }
}
