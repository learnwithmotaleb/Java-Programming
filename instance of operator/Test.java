public class Test {

     public static void main(String[] args) {
          Nila nila = new Nila();
          Sonia sonia = new Sonia();
          Motaleb motaleb = new Motaleb();

          System.out.println(nila instanceof Nila);
          System.out.println(sonia instanceof Sonia);
          System.out.println(motaleb instanceof Motaleb);
          System.out.println(sonia instanceof Motaleb);
          System.out.println(nila instanceof Motaleb);
          System.out.println(nila instanceof Sonia);
          System.out.println(motaleb instanceof Nila);
          System.out.println(motaleb instanceof Sonia);


     
     }
     
}
