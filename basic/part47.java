public class part47 {
     public static void main(String[] args) {
          // string class
          // string buffer class
          // string builder class

          String s1 = "Abdul Motaleb";
          String s2 = new String("abdul Motaleb");

          System.out.println(s1);
          System.out.println(s2);

          int x = s1.length();
          System.out.println(x);

          char[] s3 = { 'a', 'b', 'c', 'd', 'f' };
          System.out.println(s3);

          String n = "Hello";

          if (s1==s2){
               System.out.println("Equal");
          } else {
               System.out.println("Not Equal");

          }

          if (s1.equals(s2)) {
               System.out.println("Equal");
          } else {
               System.out.println("Not Equal");

          }

          if (s1.contains(s2)) {
               System.out.println("Equal");
          } else {
               System.out.println("Not Equal");

          }

          if (s1.equalsIgnoreCase(s2)) {
               System.out.println("Equal");
          } else {
               System.out.println("Not Equal");

          }

          boolean con = n.contains("h");
          System.out.println(con);

          boolean b = n.isEmpty();
          System.out.println(b);

     }
}
