public class Rectangle extends Shape{
     private int length;
     private int breadth;
     
     

     public Rectangle(int length, int breadth) {
           super("Reactangle");
           this.length = length;
           this.breadth = breadth;
     }



     public  double calculateArea() {
     
           return length * breadth;
             
         }
}

