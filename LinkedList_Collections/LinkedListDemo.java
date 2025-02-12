import java.util.LinkedList;

public class LinkedListDemo {

     public static void main(String[] args) {
          
          LinkedList<String> names = new LinkedList<>();

          names.add("Abdul Motaleb");
          names.add("Sonia Akter");
          names.add("Nila Akter");
          names.add(2,"Ripon Islam");
          names.addFirst("Rabeya");
          names.addLast("Beauty");
          // System.out.println(names);
          // System.out.println("Size of LinkedList: "+ names.size());

          // for(String name: names){
          //      System.out.println(name);
          // }



          // names.remove(3);
          // names.removeFirst();
          // names.removeLast();
          // names.get(2);
          // System.out.println(names);

          System.out.println(names.getFirst());
          System.out.println(names.getLast());
          names.clear();
          System.out.println(names);
        
     };
}