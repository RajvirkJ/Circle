
package circle;


public class Circle {
//radius is an instance variable
   private double radius;
   // numberOfObjects is a static variable
   private static int numberOfObjects;

    public Circle() {
       this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
        numberOfObjects++;
    }
    
    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius>=0) 
        this.radius= radius;
        else 
            throw new IllegalArgumentException ("Radius is"+radius+" .Radius can not be negative");
    //this.radius=radius >=0 ? radius:0;
    }

    public double getRadius() {
        return radius;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
    
    
    public double getArea() {
    return radius*radius*Math.PI;
    }
    
    

   
    
    
   
   
    
}
