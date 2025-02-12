package overloading_constructor;

public class Teacher {
     String name,gender;
     int phone;
     String univerisity;

     Teacher(){
          System.out.println("No Information");
     }

     Teacher(String n,String g,int p){
          name = n;
          gender = g;
          phone = p;
     }

     Teacher(String u){
          univerisity = u;
     }

     void display(){
          System.out.println("Name: "+name);
          System.out.println("Gender: "+gender);
          System.out.println("Phone: "+phone);
          System.out.println("University: "+univerisity);
     }

     
}
