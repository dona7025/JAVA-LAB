/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author sjcet
 */
public class Rectangle {
    int l,b;

  Rectangle(int a,int c) 
  {
      l=a;
      b=c;
    }
  public void area()
  {
      int ar=l*b;
      System.out.println("Length of Rectangle:"+l);
      System.out.println("Breadth of Rectangle:"+b);
      System.out.println("Area:"+ar);
  }
    public void Perimeter()
  {
     int p=(l+b)*2;
      System.out.println("Length of Rectangle:"+l);
      System.out.println("Breadth of Rectangle:"+b);
      System.out.println("Perimeter:"+p);
  }

    public static void main(String[] args) {
       Rectangle R1=new Rectangle(10,20);
       Rectangle R2=new Rectangle(5,6);
       R1.area();
       R1.Perimeter();
       R2.area();
       R2.Perimeter();
      
    }
    
}
