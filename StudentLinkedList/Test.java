import java.util.LinkedList;

public class Test {
     public static void main(String[] args) {

          // student linkedlist
          LinkedList<StudentList> studentLists = new LinkedList<StudentList>();

          // create Student
          StudentList s1 = new StudentList(21, "Nila", "CSE");
          StudentList s2 = new StudentList(33, "Motaleb", "CSE");
          StudentList s3 = new StudentList(44, "Sonia", "CSE");

          // adding students
          studentLists.add(s1);
          studentLists.add(s2);
          studentLists.add(s3);

          // printing student
          for (StudentList s : studentLists) {
               System.out.println("Id: " + s.id);
               System.out.println("University: " + StudentList.UNIVERSITY_NAME);
               System.out.println("Name: " + s.name);
               System.out.println("Department: " + s.department);
               System.out.println();
          }

     }
}
