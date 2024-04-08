package collection;

import java.util.Scanner;

public class ABDriverss {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Banks b1=new Banks();
		boolean exit=true;
		
		while(exit)
		{
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
			{
				b1.createAccount();
			}
			break;
			
			case 2:
			{
				b1.removeAccount();
			}
			break;
			case 3:
			{
			
				b1.updateDetails();
			}
			break;
			case 4:
			{
				b1.displayDetails();
			}
			break;
			case 5:
			{
				b1.deposit();
			}
			
			default:
			{
				System.out.println("Invalid choice");
			}
			}
			
		}
	}
	

}
