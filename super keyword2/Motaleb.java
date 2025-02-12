public class Motaleb extends Sonia {

     int gear;

     Motaleb(String c, double w, int g) {
          super(c, w);
          gear = g;
          
     }

     void attribute(){
          super.attribute();
          System.out.println("Gear: "+gear);
     }

}
