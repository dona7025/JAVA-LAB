/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics.Figures;
public class Rectangle
{
    private int le,be;
    public Rectangle(int l,int b)
    {
        le=l;
        be=b;
    }
    public int area()
    {
        return(le*be);
    }
}