package constructorProg;

import java.util.Scanner;

public class EmployeeMain {
	

		public static void main(String[] args) {
			
			new Employee();
			
			int da;
			int hra;
			Scanner s=new Scanner(System.in);

		System.out.println("Enter the DA : ");
		da=s.nextInt();
		
		System.out.println("Enter the HRA : ");
		hra=s.nextInt();
		
		Employee emp1=new Employee(da,hra);
		emp1.input();
		emp1.salarycalculate();
		emp1.displaydata();

			}
}