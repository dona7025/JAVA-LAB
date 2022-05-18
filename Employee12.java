/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee12;


    public class Employee12
{
	int id;
	String name;
	
	public Employee12(int i, String n)
	{
		id = i;
		name = n;
	}
	void show()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String args[])
	{
		Employee12 emp1 = new Employee12(1, "Mebin");
		Employee12 emp2 = new Employee12(2, "Anitha");
                Employee12 emp3 = new Employee12(3, "Amitha");
		emp1.show();
		emp2.show();
                System.out.println(emp3.id+" "+emp3.name);
	}
}

