public class Circle extends Shape {

     double radius;

     Circle(double radius){
          super(radius, radius);
  
     }
     @Override
     void area() {
          double reslut = Math.PI*dim1*dim2;
          System.out.print("Circle of Area: "+reslut);
          System.out.println();
        
     }


     
}
