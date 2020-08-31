package constructorProg;

import java.util.Scanner;

public class BankAddAmount {

	public static void main(String[] args) {
		int amount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Can you add any amount to your account ?");
		char c=sc.next().charAt(0);
		if(c=='y') 
		{
		System.out.println("Enter amount  is added to your account : ");
		amount=sc.nextInt();
		
		Bank b1=new Bank(amount);
		b1.display();
		}
		else
		{
			Bank b=new Bank();

		}
		
	}

}
