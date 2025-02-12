import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class part55 {
     public static void main(String[] args) {
          //current time
          LocalTime time = LocalTime.now();
          System.out.println(time);

          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");

          String formatterTime = time.format(formatter);
          System.out.println(formatterTime);

          LocalDate date = LocalDate.now();
          System.out.println(date);


     }
}
