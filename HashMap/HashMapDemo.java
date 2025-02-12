import java.util.HashMap;

public class HashMapDemo {

     public static void main(String[] args) {
          HashMap<String,String> nameHashMap = new HashMap<>();
          nameHashMap.put("name", "Motaleb");
          System.out.println(nameHashMap.get("name"));
     }
}