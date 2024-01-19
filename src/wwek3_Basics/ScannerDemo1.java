package wwek3_Basics;

import java.util.Scanner;
public class ScannerDemo1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your name:");//priyanka nigade
//		String name=sc.next();
//		System.out.println("Hello "+name);//priyanka
		
		String name=sc.nextLine();
		System.out.println(name);
		
		
		System.out.println("Enter your age:");
		
		int age=sc.nextInt();		
		System.out.println("Your age is: "+age);
		
		System.out.println("Enter your gender 'M/F'");
		char ch=sc.next().charAt(0);
		System.out.println("gender is: "+ch);
		
		
		
		
		

	}

}
