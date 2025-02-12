public class Sonia {

     String name;  //instance variable
     int id;  //instance variable
     static String universityName = "Northern University Bangladesh"; //static variable

     Sonia(String n, int i){
          name = n; //local variable
          id = i;  //local variable
     }

     void display(){
          System.out.println("Name: "+name);
          System.out.println("Id: "+id);
          System.out.println("University Name: "+universityName);
     }


}