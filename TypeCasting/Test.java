public class Test {

     public static void main(String[] args) {
          
          Motaleb motaleb = new Motaleb();
          Sonia motaleb2 = new Motaleb();



          motaleb.display();
          motaleb2.display();

          Motaleb mm = (Motaleb)new Sonia();
          mm.display();



     }
}