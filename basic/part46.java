import java.util.ArrayList;
import java.util.Collections;

public class part46 {
     public static void main(String[] args) {
          //arraylist of sorting

          ArrayList<Integer> number = new ArrayList<>();
          number.add(19);
          number.add(8);
          number.add(2);
          number.add(10);
          number.add(11);

          System.out.println("Size of Array List: "+ number.size());
          System.out.println("All Elements: " +number);

          Collections.sort(number);

          System.out.println("After Sort Assending Size of Array List: "+ number.size());
          System.out.println("After Sort Assending All Elements: " +number);

          // Collections.reverse(number);
          Collections.sort(number, Collections.reverseOrder());

          System.out.println("After Sort Decending Size of Array List: "+ number.size());
          System.out.println("After Sort Decending All Elements: " +number);







          
     }
}
