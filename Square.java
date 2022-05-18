/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics.Figures;

public class Square
{
    private int side;
    public Square(int s)
    {
        side=s;
    }
    public int area()
    {
        return(side*side);
    }
}
