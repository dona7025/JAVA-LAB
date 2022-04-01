/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author sjcet
 */
public class Employee {
int Emp_Id;
String Emp_Name;
float Salary;
Employee(int a,String b,float c)
{
    Emp_Id=a;
    Emp_Name=b;
    Salary=c;
}
public void T_Salary()
{
  float percent=(Salary*20)/100;
float total_sal=Salary+percent;
System.out.println("Employee id:"+Emp_Id);
System.out.println("Employee Name:"+Emp_Name);
System.out.println("Employee Salary:"+Salary);
System.out.println("Total Salary:"+total_sal);
}
    public static void main(String[] args) {
      Employee E1=new Employee(10,"Don",10000);
      Employee E2=new Employee(12,"Manu",20000);
      E1.T_Salary();
      System.out.println("\n");
      E2.T_Salary();
    }
    
}
