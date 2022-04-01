/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_sum;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
public class A_Sum {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int i,a[];
    Scanner sObj = new Scanner(System.in);
    System.out.println("Enter no.of elements in Array:");
    int num = sObj.nextInt();
    System.out.println("Input elements in Array:");
    for(i=0;i<num;i++)
    {
        a[i]=sObj.nextInt();
    }
    
    
    }
    
}
