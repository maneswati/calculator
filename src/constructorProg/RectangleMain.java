package constructorProg;

import java.util.Scanner;

public class RectangleMain {

	public static void main(String[] args) {
		int number=0,length,breadth;
		
		Scanner sc=new Scanner(System.in);
		
		Rectangle r=new Rectangle();
		r.calculatearea();
	
		
		System.out.println("Enter the any number :");
		number=sc.nextInt();
		
		Rectangle obj=new Rectangle(number);
		obj.calculatearea();
		
		
		System.out.println("Enter the rectangle length : ");
		length=sc.nextInt();
		
		System.out.println("Enter the rectangle breadth : ");
		breadth=sc.nextInt();
		
		
		Rectangle r2=new Rectangle(length,breadth);
		r2.calculatearea();
	}

}
