package constructorProg;

import java.util.Scanner;

public class Employee {
	
		int da,hra,id;
		String name,contactno;
		Scanner sc=new Scanner(System.in);
		void input() {
			System.out.println("Enter Employee Name : ");
			name=sc.next();
			
			System.out.println("Enter Employee Id : ");
			id=sc.nextInt();
			
			System.out.println("Enter Employee Contact No : ");
			contactno=sc.next();
		}
		
	Employee()
	{
		System.out.println("No Employee Data are available ");
	}
	Employee(int da, int hra)
	{
		this.da=da;
		this.hra=hra;
	}
	void salarycalculate()
	{
		int sal=da+hra;
		System.out.println("salary : "+sal);
		 
	}
	void displaydata()
	{
		
		System.out.println("Employee Name is : "+name);
		System.out.println("Employee Id is : "+id);
		System.out.println("Employee Contact No is : "+contactno);

		
	}

}