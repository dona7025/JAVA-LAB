/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics.Figures;

public class Circle {
 private int radious;
 public Circle(int r)
 {
     radious=r;
 }
 public double area()
 {
     return(3.14*radious*radious);
     
 }
}
