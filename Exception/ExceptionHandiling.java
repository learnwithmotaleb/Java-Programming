public class ExceptionHandiling {

     public static void main(String[] args) {
          
    

          try{
               // int x = 10;
               // int y = 0;
               // int result = x/y;
               // System.out.println("Result : "+result);

               int[] a = new int[4];
               a[4]  =10;
               

          }catch(ArithmeticException exception){
               System.out.println(exception.toString());

          }catch(Exception exception){
               System.out.println(exception.toString());

          }
          
          finally{
               System.out.println("Last of line the program");
     
          }



     }

     
}