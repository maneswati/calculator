package constructorProg;

public class Bank {
	int amount=5000;
	
	Bank()
	{ 
		System.out.println("No any amount is added ");
	}
	
	Bank(int amount)
	{ 
		this.amount=this.amount+amount;
		System.out.println("The amount "+amount+" is credit to your account");
	}

	void display() 
	{
		System.out.println("The total account balance is : "+amount);
	}
	
}
