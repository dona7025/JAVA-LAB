/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum2;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
public class Sum2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum;
        Scanner sObj = new Scanner(System.in);
    System.out.println("Enter 2 Numbers:");

    int n1 = sObj.nextInt();
    int n2 = sObj.nextInt();

        
        
        sum=n1+n2;
        System.out.println("The sum of numbers is :"+sum);
    }
    
}
