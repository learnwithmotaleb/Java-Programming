import java.util.HashSet;

public class HashSetDemo {

     public static void main(String[] args) {
          
          HashSet<String> names = new HashSet<>();
          names.add("Sonia");
          names.add("Motaleb");
          names.add("Nila");
          names.add("Nila");
          names.remove("Nila");

          System.out.println(names);
          System.out.println(names.size());
     }
}
