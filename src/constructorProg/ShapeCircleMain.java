package constructorProg;

import java.util.Scanner;

public class ShapeCircleMain {

	public static void main(String[] args) {
		float radius;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of circle radius : ");
		radius=sc.nextFloat();
		
		ShapeCircle shc=new ShapeCircle(radius);
		shc.shapecircle(radius);
		
		ShapeCircle shc1=new ShapeCircle(radius,3.5f);
		shc1.shapecircle(radius);		
	}

}

