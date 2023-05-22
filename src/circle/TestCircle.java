
package circle;


public class TestCircle {
    public static void main(String[] args) {
  
    
   try{
        Circle c1= new Circle(5.0);
        System.out.println("Total objects created = "+ Circle.getNumberOfObjects());
        System.out.println("Total objects created = "+ c1.getNumberOfObjects());
            System.out.println("The area of the circle c1 with radius "+ c1.getRadius()+ " is "+c1.getArea());

   }
   catch(IllegalArgumentException ex){
       System.out.println(ex);
   }

    try {
        Circle c2= new Circle(6.0);
        System.out.println("Total objects created = "+ Circle.getNumberOfObjects());
    System.out.println("The area of the circle c2 with radius "+ c2.getRadius()+ " is "+c2.getArea());
        
    }
    catch(IllegalArgumentException ex){
       System.out.println(ex);
   }
    
    try{
        Circle c3= new Circle (1.0);
        System.out.println("The area of the circle c3 with radius "+ c3.getRadius()+ " is "+c3.getArea());
    System.out.println("Total objects created = "+ Circle.getNumberOfObjects());
    }
   catch(IllegalArgumentException ex){
       System.out.println(ex);
   }

}
    
}
