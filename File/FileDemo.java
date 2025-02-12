import java.io.File;

public class FileDemo {

     public static void main(String[] args) {
          // File dirFile = new File("sonia");
          File dirFile = new File("//Users//abdulmotaleb//Desktop/Motaleb");
          // dirFile.mkdir(); //create directory
          // System.out.println(dirFile.getAbsolutePath());
         // dirFile.delete();
          // System.out.println(dirFile.getName());
          // if(dirFile.delete()){
          //      System.out.println("Folder has been Delete "+dirFile.getName());

          // }

          // System.out.println(dirFile.getName());

          File file1 = new File(dirFile.getAbsolutePath()+"//student.txt");
          File file2 = new File("//Users//abdulmotaleb//Desktop/Motaleb//teacher.txt");

          try{
               file1.createNewFile();
               file2.createNewFile();

               System.out.println("File Create Successfully!");

          }catch(Exception e){
               System.out.println(e.toString());
          }

          if(file1.exists()){
               System.out.println("File Exits");
          }else{
               System.out.println("File Not Exits");

          }



     }
}