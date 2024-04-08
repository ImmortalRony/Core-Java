package collection;

import java.util.ArrayList;
import java.util.Scanner;

import oops_concept.Student;

public class School {
	Students s;
	ArrayList<Students>a1=new ArrayList<>();
	Scanner sc =new Scanner(System.in);
	
	public void takeAdmission()
	{
		System.out.println("Enter the student name");
		String sname =sc.next();
		System.out.println("Enter the student id");
		int id=sc.nextInt();
		System.out.println("Enter the standard of the student");
		int std=sc.nextInt();
		s=new Students(sname,id,std);
		a1.add(s);
		System.out.println("Admission successfull...");
		
	}
	
	public void cancelAdmission()
	{
		System.out.println("Enter the id of a student to cancel Admission");
		int id=sc.nextInt();
		for(Students s:a1)
		{
			if(id==s.sid)
			{
			a1.remove(s);
			System.out.println("Admission cancelled...");
			return;
			}
		}
		System.out.println("Student does not exist");
		
	}
	
	public void updateStd() 
	{
		System.out.println("Enter the student id to update std");
		int id=sc.nextInt();
		for(Students s: a1)
		{
			if (id==s.sid)
			{
				System.out.println("Enter the std to update");
				int std =sc.nextInt();
				s.std=std;
				System.out.println("Standard updated succesffuly");
				return;
				
			}
		}
		System.out.println("Student does not exist");
	}
	
	public void displayDetails()
	{
		System.out.println("Enter the id to display");
		int id=sc.nextInt();
		for(Students s:a1)
		{
			if(id==s.sid)
			{
				System.out.println(s);
				return;
			}
		}
	}

}
