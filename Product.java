/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

/**
 *
 * @author sjcet
 */
public class Product {
int pcode;
String pname;
float price;
Product(int a,String b,float c)
{
    pcode=a;
    pname=b;
    price=c;
}

    public static void main(String[] args) {
       Product F1=new Product(10,"Pen",10);
       Product F2=new Product(12,"Book",45);
       Product F3=new Product(12,"Pencile",5);
        if( F1.price <= F2.price && F1.price <= F3.price)
            System.out.println(F1.pname+ " has Lowest.");
        else if (F2.price <= F1.price && F2.price <= F3.price)
            System.out.println(F2.pname+ " has Lowest.");
        else
           System.out.println(F3.pname+ " has Lowest.");

       
    }
    
}
