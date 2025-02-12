import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class WriteFileDemo {
     public static void main(String[] args) {

          Scanner input = new Scanner(System.in);
          System.out.print("Enter Some Text for Write File: ");
          String fileWrite = input.nextLine();
          try {
               // Create Folder
               File dirFile = new File("//Users//abdulmotaleb//Desktop/Motaleb");

               // Get Absolute Path
               File file1 = new File(dirFile.getAbsolutePath() + "//sonia.txt");

               // Create File
               file1.createNewFile();
               System.out.println("File Create Successfully!");

               // File in write
               Formatter formatter = new Formatter(dirFile.getAbsolutePath() + "//sonia.txt");
               formatter.format("%s \n ", fileWrite);
               // formatter.format("%s \r","Hey, I'm Nila Akter");
               // formatter.format("%s \r","Hey, I'm Motaleb");

               formatter.close();

          } catch (Exception exception) {
               System.out.println(exception.toString());
          }
     }
}
