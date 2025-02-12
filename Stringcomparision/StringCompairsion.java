public class StringCompairsion {
     public static void main(String[] args) {

          String password1 = "123456";
          String password2 = new String("123456");

          System.out.println(password1.equals(password2));
          System.out.println(password1.equalsIgnoreCase(password2));
          System.out.println(password1==password2);

          
     } 

     
}