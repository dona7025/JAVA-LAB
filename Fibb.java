/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibb;

/**
 *
 * @author sjcet
 */
public class Fibb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n1=0,n2=1,n3,i,count=10;    
 System.out.print(n1+" "+n2);   
    
 for(i=2;i<count;++i)    
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }  
 System.out.println(" ");

    }
    
}
