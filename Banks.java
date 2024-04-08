package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Banks {
	Accounts a;
	ArrayList<Accounts>a1= new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	
	public void createAccount()
	{
		System.out.println("Enter name");
		String name =sc.next();
		System.out.println("Enter Account number");
		int acno=sc.nextInt();
		System.out.println("Enter IFSC Code");
		int ifsc=sc.nextInt();
		System.out.println("Enter password");
		String pswd=sc.next();
		System.out.println("Enter city");
		String city=sc.next();
		System.out.println("Enter cno");
		int cno=sc.nextInt();
		System.out.println("Enter the Balance");
		int bal=sc.nextInt();
		a=new Accounts(name, acno, ifsc, pswd, city, bal,cno );
		a1.add(a);
	}
	
	public void removeAccount()
	{
		System.out.println("Enter the password");
		String pswd=sc.next();
		for(Accounts a:a1)
		{
		if (a.pswd.equals(pswd))
		{
			a1.remove(a);
			System.out.println("Account removed successfully...");
			return;
		}
		
		}
		{
			System.out.println("Incorrect Password");
		}
		
	}
	
	public void updateDetails()
	{
		
		System.out.println("Enter the password");
		String pswd=sc.next();
		for(Accounts a:a1)
		{
			if (a.pswd.equals(pswd))
			{
			System.out.println("Choose from following you want to update \n.1 Name \n2. City \n3.Contact No. \n4. All of the above");	
			int choice =sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter the name");
				String name=sc.next();
				a.name=name;
			}
			break;
			case 2:
			{
				System.out.println("Enter the City");
				String city=sc.next();
				a.city=city;
			}
			break;
			case 3:
			{
				System.out.println("Enter the contact number");
				int cno=sc.nextInt();
				a.cno=cno;
			}
			break;
			case 4:
			{
				System.out.println("Enter the name");
				String name=sc.next();
				a.name=name;
				System.out.println("Enter the City");
				String city=sc.next();
				a.city=city;
				System.out.println("Enter the contact number");
				int cno=sc.nextInt();
				a.cno=cno;	
			}
			break;
			default:
			{
				System.out.println("Invalid Choice");
			}
		}
			return;
			}
		}
		
		
		{
			System.out.println("Incorrect Password");
		}
	}
	
	public void displayDetails()
	{	
		System.out.println("Enter the password");
		String pswd=sc.next();
		for(Accounts a:a1)
		{
		if (a.pswd.equals(pswd)) 
		{
			System.out.println(a);
			return;
		}
		}
		System.out.println("Incorrect password");		
	}
	
	public void deposit()
	{
		System.out.println("Enter the password");
		String pswd=sc.next();
		for(Accounts a:a1)
		{
		if (a.pswd.equals(pswd)) 
		{
			System.out.println("Enter the amount to be deposit");
			int dep=sc.nextInt();
			a.bal=a.bal+dep;
			return;		
		}
		}
		System.out.println("Incorrect password");	
	}
	
	public void withdrawl()
	{
		System.out.println("Enter the password");
		String pswd=sc.next();
		for(Accounts a:a1)
		{
		if (a.pswd.equals(pswd)) 
		{
			System.out.println("Enter the amount to be deposit");
			int wit=sc.nextInt();
			a.bal=a.bal+wit;
			return;		
		}
		}
		System.out.println("Incorrect password");
	}
	

}

