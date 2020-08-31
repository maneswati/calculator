package constructorProg;

import java.util.Scanner;

public class Programming {
	
	
	Scanner sc=new Scanner(System.in);
	
	void learn()
	{
		System.out.println("Passed any string : ");
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
