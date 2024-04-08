package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class SwiggyD {
	Customer1 c;
	Hotel1 h;
	Scanner sc=new Scanner(System.in);
	ArrayList<Customer1>c1=new ArrayList<>();
	ArrayList<Hotel1>h1=new ArrayList<>();
	int coffee=100;
	int veg=150;
	int crostini=200;
	int biryani=200;
	int desert=100;
	
	int i=0;
	int a=100;
	int b=1;
	
	public void createAccount()
	{
		System.out.println("Enter name of customer");
		String name=sc.next();
		System.out.println("Enter the contact number");
		int cno=sc.nextInt();
		System.out.println("Enter the city");
		String city=sc.next();
		c =new Customer1(name,cno,city);
		c1.add(c);
		System.out.println("Account created successfully...");
	}
	
	public void placeOrder()
	{
		
		System.out.println("Choose from the following");
		System.out.println("1. Cold Coffee\n2. Veg Manchurian\n3. Crostini\n4. Biryani\n5. Desert ");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			{		
				System.out.println("Enter Hotel name");
				String hname=sc.next();
				System.out.println("Enter the address");
				String add=sc.next();
				h=new Hotel1(hname,add,"Cold Coffee");
				h1.add(h);			
			}
			break;
			case 2:
			{
				System.out.println("Enter Hotel name");
				String hname=sc.next();
				System.out.println("Enter the address");
				String add=sc.next();
				h=new Hotel1(hname,add,"Veg Manchurian");
				h1.add(h);
			}
			break;
			case 3:
			{
				System.out.println("Enter Hotel name");
				String hname=sc.next();
				System.out.println("Enter the address");
				String add=sc.next();
				h=new Hotel1(hname,add,"Crostini");
				h1.add(h);			
			}
			break;
			case 4:
			{
				System.out.println("Enter Hotel name");
				String hname=sc.next();
				System.out.println("Enter the address");
				String add=sc.next();
				h=new Hotel1(hname,add,"Biryani");
				h1.add(h);			
			}
			break;
			case 5:
			{
				System.out.println("Enter Hotel name");
				String hname=sc.next();
				System.out.println("Enter the address");
				String add=sc.next();
				h=new Hotel1(hname,add,"Desert");
				h1.add(h);		
			}
			break;
			
			default:
			{
				System.out.println("Invalid choice");
			}
		}
		i++;		
	}
	
	public void cancelOrder()
	{
		if (i==0)
		{
			System.out.println("First select hotel and order");
		}
		else
		{
			System.out.println("Enter the order to cancel");
			String item=sc.next();
			for(Hotel1 h:h1)
			{
				if(h.ord1.equals(item))
				{
					h1.remove(h1);
					System.out.println("Order cancelled successfully...");
				}
			}
		}
	}
	
	public void deleteAccount()
	{
		System.out.println("Enter contact number of account you want to delete");
		int cno=sc.nextInt();
		for(Customer1 c:c1)
		{
		if (cno==c.cno)
		{
			c1.remove(c);
			System.out.println("Account deleted successfully");
			return;
		}
		}	
		{
			System.out.println("Customer does not exist...");
		}
	}
	
	public void displayDetails()
	{
		System.out.println(c1);
		System.out.println(h1);
	}
	
	public void showTotal()
	{
		if (i==0)
		{
			System.out.println("First select Hotel and order");
		}
		else
		{
			for(Hotel1 h: h1)
			{
				if (h.ord1.equals("Cold Coffee"))
				{
					int total=0;
					total+=coffee;
					System.out.println("Order details:"+h1);
					System.out.println("Total amount ="+total);
				}
				else if (h.ord1.equals("Veg Manchurian"))
				{
					int total=0;
					total+=veg;
					System.out.println("Order details:"+h1);
					System.out.println("Total amount ="+total);
				}
				if (h.ord1.equals("Crostini"))
				{
					int total=0;
					total+=crostini;
					System.out.println("Order details:"+h1);
					System.out.println("Total amount ="+total);
				}
				if (h.ord1.equals("Biryani"))
				{
					int total=0;
					total+=biryani;
					System.out.println("Order details:"+h1);
					System.out.println("Total amount ="+total);
				}
				if (h.ord1.equals("Desert"))
				{
					int total=0;
					total+=desert;
					System.out.println("Order details:"+h1);
					System.out.println("Total amount ="+total);
				}
			}
		}
	}

}
