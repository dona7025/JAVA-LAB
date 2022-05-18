
package shapes_area;

import java.util.Scanner;
public class Shapes_Area
{
  
    public static void main(String[] args)
    {
        int sq,l,b,x,y,z;
        double r;
        Scanner in = new Scanner(System.in);
        System.out.println("Input the length of side of Square");
        sq = in.nextInt();
        
        System.out.println("Input the length and breadth of Rectangle");
        l = in.nextInt();
        b = in.nextInt();
        
        System.out.println("Input the radius of circle");
        r = in.nextDouble();
        
        System.out.println("Input the 3 Sides of Rectangle");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        Rectangle obj = new Rectangle();
        obj.Area(l, b);
    
        
        Circle obj1 = new Circle();
        obj1.Area(r);
       
        
        Square obj2 = new Square();
        obj2.Area(sq);
       
        Triangle obj3=new Triangle();
        obj3.Area(x, y, z);
    }
}
class Square 
{
    void Area(int side)
    {
        System.out.println("\nArea of the Square: "+ side * side);
    }
    
}
class Circle 
{
    static final double PI = Math.PI;
  
    void Area(double r)
    {
        double A = PI * r * r;
  
        System.out.println("\nArea of the circle is :" + A);
    }
  
    
}
class Rectangle 
{
   
    
    void Area(int l, int b)
    {
        System.out.println("\nArea of the rectangle: " + l * b);
    }
}

class Triangle 
{
   
    
    void Area(int a, int b,int c)
    {
    double s=(a+b+c)/2;
    double triArea;
    triArea=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println("\nArea of the Triangle:"+triArea);
    }
}