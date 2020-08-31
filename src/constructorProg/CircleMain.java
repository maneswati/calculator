package constructorProg;

import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {
		float radius;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENter the value of radius :");
		radius=sc.nextFloat();
		
		Circle c=new Circle();
		float area=c.circlearea(radius);
		System.out.println("The area of circle is : "+area);
		
		float circumference=c.circumference(radius);
		System.out.println("The circle circumference is : "+circumference);


	}

}
