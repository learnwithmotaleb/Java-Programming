import java.util.ArrayList;

public class part44 {
     public static void main(String[] args) {
          ArrayList<Integer> number = new ArrayList<>();

          number.add(20);
          number.add(30);
          number.add(40);
          number.add(50);
          number.add(60);

          System.out.println("Size of arrayList : "+number.size());
          System.out.println("AarrayList : "+number);

          //number.clear();
          //number.clear();
       
          // boolean x = number.isEmpty();
          // System.out.println(x);
          // boolean b = number.contains(5550);
          // System.out.println(b);

          // int x = number.indexOf(30);
          // System.out.println(x);

          number.set(2, 66);
          System.out.println(number.get(2));

          System.out.println("Size of arrayList : "+number.size());
          System.out.println("AarrayList : "+number);

     }
}
