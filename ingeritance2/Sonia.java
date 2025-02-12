public class Sonia extends Motaleb {

     private String qualification;

     public void setQualification(String qualification) {
          this.qualification = qualification;
     }

     public String getQualification() {
          return qualification;
     }

     void display() {
          System.out.println("Name: " + getName());
          System.out.println("Age: " + getAge());
          System.out.println("Qualification: " + getQualification());
          System.out.println();

     }

}
