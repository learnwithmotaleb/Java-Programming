public class Motaleb {

     void add(int ...numbers){
          int sum = 0;
          for(int x : numbers){                          
               sum = sum + x; 
          }
          System.out.println("Sum of all Elements: "+sum);
     }

 
}