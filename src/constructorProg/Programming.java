package constructorProg;

import java.util.Scanner;

public class Programming {
	
	
	Scanner sc=new Scanner(System.in);
	
	void learn()
	{
		System.out.println("Do you want to learn any language like Java, C, Angular, Asp.net: ");
		String ans=sc.next();
		if(ans!=null)
		{
			System.out.println("I want to learn "+ans);
		}
		else
		{
			System.out.println("I want to learn language");
		}
		
	}
	

}
