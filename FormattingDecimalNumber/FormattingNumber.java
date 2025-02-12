import java.text.DecimalFormat;

public class FormattingNumber {
     public static void main(String[] args) {
          double x = 123.4586858;
          // System.out.printf("Result of %.2f",x);
          // System.out.println();


          DecimalFormat obDecimalFormat = new DecimalFormat("0.000");
          System.out.println(obDecimalFormat.format(x));





     }

     
}