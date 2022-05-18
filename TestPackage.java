/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;
import java.util.Scanner;
import graphics.Figures.*;
public class TestPackage {
    public static void main(String[] args) 
        {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the side of Square:");
  int s=sc.nextInt();
  Square sq=new Square(s);
  System.out.println("Area of Square is:"+sq.area());
   
  System.out.println("Enter the radious of Circle:");
   int r=sc.nextInt();
   Circle ci=new Circle(s);
   System.out.println("Area of Circle is:"+ci.area());
        
     System.out.println("Enter the 3 Sides of Triangle:");
   int s1=sc.nextInt();
   int s2=sc.nextInt();
   int s3=sc.nextInt();
   Triangle T=new Triangle(s1,s2,s3);
   System.out.println("Area of Triangle is:"+T.area());
        
     System.out.println("Enter the 2 Sides of Rectangle:");
   int l=sc.nextInt();
   int b=sc.nextInt();
   Rectangle re=new Rectangle(l,b);
   System.out.println("Area of Rectangle is:"+re.area());     
        
        }
    }
