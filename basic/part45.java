import java.util.ArrayList;

public class part45 {
     public static void main(String[] args) {
          ArrayList<Integer> number1 = new ArrayList<>();
          ArrayList<Integer> number2 = new ArrayList<>();
          ArrayList<Integer> number3 = new ArrayList<>();

          number1.add(6);
          number1.add(8);
          number1.add(5);
          number1.add(3);
          number1.add(9);

          number2.add(4);
          number2.add(5);
          number2.add(9);
          number2.add(7);
          number2.add(2);
          number2.add(9);

          number3.add(6);
          number3.add(8);
          number3.add(5);
          number3.add(3);
          number3.add(9);
      

          // System.out.println("Array List All Element: "+number1);
          // System.out.println("Array List Size: "+number1.size());

          // System.out.println("Array List All Element: "+number2);
          // System.out.println("Array List Size: "+number2.size());

          // number3.addAll(number1);
          // number3.addAll(number2);
        

          System.out.println("Array List All Element: "+number3);
          System.out.println("Array List Size: "+number3.size());

         boolean x= number1.equals(number3);
         System.out.println(x);
    
        

          System.out.println("Array List All Element: "+number3);
          System.out.println("Array List Size: "+number3.size());



     }
}
