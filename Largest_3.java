/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largest_3;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
public class Largest_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sObj = new Scanner(System.in);
        System.out.println("Enter 3 Numbers:");
        int n1 = sObj.nextInt();
        int n2 = sObj.nextInt();
        int n3 = sObj.nextInt();
        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");
        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");
        else
            System.out.println(n3 + " is the largest number.");

    }
    
}
