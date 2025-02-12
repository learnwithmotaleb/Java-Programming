public class Motaleb extends Sonia{

     String hereColor;


     Motaleb(String name,int age){
          this.name = name;
          this.age = age;


     }


     Motaleb(String name,int age, String hereColor){
          this(name, age);
          this.hereColor = hereColor;


     }

     void display(){

          System.out.println("Name: "+name);
          System.out.println("Age: "+age);
          System.out.println("HereColor: "+hereColor);
          System.out.println();
     }


     
}
