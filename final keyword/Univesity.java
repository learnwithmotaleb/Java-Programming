public class Univesity {

      String UNIVERSITY_NAME = "NUB";
     final int fees; //blank final variable

     static final String nila; //static blank final variable
     static{
          nila = "Hello, Nila";
     }


     Univesity(int k){
          fees = k; 
     }

     void display(){



          System.out.println("Univesity Name: "+UNIVERSITY_NAME);
          System.out.println("Univesity Fees: "+fees);
     }


     
}