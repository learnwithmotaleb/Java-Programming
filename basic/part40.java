public class part40 {
     public static void main(String[] args) {

          int[][] number = new int[2][3];

          number[0][0] = 20;
          number[0][1] = 40;
          number[0][2] = 100;
          number[1][0] = 60;
          number[1][1] = 80;
          number[1][2] = 200;


          for(int row = 0; row<number.length; row++){
               for(int cols = 0; cols<3; cols++){
                    System.out.print(number[row][cols]+ " ");

               }
               System.out.println();
          }
          System.out.println();


     

          
     }
}
