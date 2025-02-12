public class Test {
     public static void main(String[] args) {

          Shape[] shapes = new Shape[3];

          shapes[0] = new Shape();
          // System.out.println( shapes[0].area());

          shapes[1] = new Rectangle(10, 10);
          // System.out.println( shapes[1].area());

          shapes[2]= new Triangle(10, 10);
          // System.out.println( shapes[2].area());
          // System.out.println();

          for(int i=0; i<shapes.length; i++){
               System.out.println( shapes[i].area());
          }

     }

}
