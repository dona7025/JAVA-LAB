/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
public class Fact {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sObj = new Scanner(System.in);
    System.out.println("Enter a Number:");

    int n = sObj.nextInt();

        int i,fact=1;    
  for(i=1;i<=n;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+n+" is: "+fact);    

    }
    
}
