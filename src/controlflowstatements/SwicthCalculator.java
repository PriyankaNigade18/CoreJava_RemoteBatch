package controlflowstatements;

import java.util.Scanner;

public class SwicthCalculator {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice of operation");
		System.out.println("Press 1 for addition\nPress 2 for subtraction");
		int num=sc.nextInt();
		
		switch(num)
		{
		case 1: 
			System.out.println("Enter two numbers");
			int a=sc.nextInt();	
			int b=sc.nextInt();
			System.out.println("Addition is: "+(a+b));
			break;
		case 2:
			System.out.println("Enter two numbers");
			int c=sc.nextInt();	
			int d=sc.nextInt();
			System.out.println("Subtraction is: "+(c-d));
			break;
			default:
				System.out.println("wrong choice!");
		}
	

	}

}
