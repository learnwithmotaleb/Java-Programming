public class part39 {
     public static void main(String[] args) {
          // for each loop or enhanch loop

          String[] names = { "Motaleb", "Nila", "Sapin", "Ripon", "Sonia" };

          // for(int i = 0; i<names.length; i++){
          // System.out.println(names[i]);
          // }
          int length = names.length;
          System.out.println("Size of array: " + length);

          for (String n : names) {
               System.out.print(n + ", ");

          }
          System.out.println();
          int[] num = {10,44,66,77,8,9};
          int sum = 0;
          for(int x:num){
               sum = sum+x;
               System.out.print(x+" ");
          }
         
          System.out.println();
          System.out.println(sum);

     }
}
