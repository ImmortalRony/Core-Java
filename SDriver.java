package collection;

import java.util.Scanner;

public class SDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SwiggyD s=new SwiggyD();
		boolean exit=true;
		while(exit)
		{
			System.out.println("");
			System.out.println("---------------------------------------------");
		System.out.println("Enter the choice\n1. Create account\n2. Place order\n3. Cancel Order\n4. Delete account\n5. Display details\n6. Show total amount\n7. Exit");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			s.createAccount();
		}
		break;
		case 2:
		{
			s.placeOrder();;
		}
		break;
		case 3:
		{
			s.cancelOrder();
		}
		break;
		case 4:
		{
			s.deleteAccount();
		}
		break;
		case 5:
		{
			s.displayDetails();
		}
		break;
		case 6:
		{
			s.showTotal();
		}
		case 7:
		{
			exit=false;
		}
		default :
		{
			System.out.println("Invalid choice....");
		}
		}
		}
	}

}
