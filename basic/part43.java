import java.util.ArrayList;

public class part43 {
     public static void main(String[] args) {

          ArrayList<Integer> number = new ArrayList<Integer>();
          System.out.println("Size of: "+number.size());

          number.add(20);
          number.add(10);
          number.add(30);
          number.add(40);

          System.out.println("Array Contains : "+ number);
          System.out.println("Size of : "+number.size());

          number.remove(1);

          System.out.println("After Removing Array Contains : "+ number);
          System.out.println("Size of : "+number.size());

          number.removeAll(number);

          System.out.println("After Removing Array Contains : "+ number);
          System.out.println("Size of : "+number.size());





          
     }
}
