import java.io.File;
import java.util.Scanner;

public class FileReadDemo {
     public static void main(String[] args) {

     
try{
              // Create Folder
               File dirFile = new File("//Users//abdulmotaleb//Desktop/Motaleb");

               // Get Absolute Path
               File file1 = new File(dirFile.getAbsolutePath() + "//sonia.txt");

               // Create File
               file1.createNewFile();
               System.out.println("File Create Successfully!");


               //read file
               Scanner scanner = new Scanner(file1);
               while (scanner.hasNext()) {

                    String name = scanner.nextLine();

                    System.out.println(name);
                    
               }




}catch(Exception exception){
     exception.toString();
}
        
               

     }
}
