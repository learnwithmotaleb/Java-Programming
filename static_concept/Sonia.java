public class Sonia {
     String name;
     int studentId;
     String department;
     static String universityName = "NUB";

     Sonia(String n,String d, int id){

          name = n;
          department = d;
          studentId = id;
       

     }

     void display(){
          System.out.println("Name: "+name);
          System.out.println("Department: "+department);
          System.out.println("Student ID: "+studentId);
          System.out.println("University Name: "+universityName);
          System.out.println();
     }



     
}