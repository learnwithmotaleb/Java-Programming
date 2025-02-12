public class part48 {
     public static void main(String[] args) {

          String name = "Sonia";
          String name2 = "Nila";

          System.out.println(name.toLowerCase());
          System.out.println(name.toUpperCase());
          System.out.println(name.trim());
          System.out.println(name.concat(name2));
          System.out.println(name.startsWith("S"));
          System.out.println(name2.startsWith("N"));
          System.out.println(name2.endsWith("a"));
          System.out.println("Hello"+" Hello");

          String[] names = {
               "Nila Akter",
               "Motaleb Islam",
               "Sonia Er",
               "Its Motaleb",
               "Motaleb",
          };

          for(String x: names){
               System.out.print(x+", ");
          }





          
     }
}
