public class Sonia {
     double height,width, depth;  //instance variable

    Sonia(double height, double width, double depth){ //local variable
     this.height = height;//hiding instance variable
     this.width = width;  //hiding instance variable
     this.depth = depth;  //hiding instance variable

    }

    void display(){
     double vol = height * width * depth;
     System.out.println("Volume is : "+vol);

    }




     
}