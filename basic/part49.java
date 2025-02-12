public class part49 {
     public static void main(String[] args) {
          
          String country = "Bangladesh is my Country";
          System.out.println(country);
          char ch = country.charAt(5);
          System.out.println(ch);

          int value =country.codePointAt(1);
          System.out.println(value);

          int index =country.indexOf("h");
          System.out.println(index);

           index =country.lastIndexOf("y");
          System.out.println(index);

      
     }
}
