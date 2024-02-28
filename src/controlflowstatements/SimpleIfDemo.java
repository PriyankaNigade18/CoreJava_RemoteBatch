package controlflowstatements;

import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args)
	{
		//simple if validates single true condition
		System.out.println("Program starts.....");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();		//int age=13;
		
		if(age>=18)
		{
			System.out.println("Valid age");
		}

		
		System.out.println("Program ends......");
	}

}
