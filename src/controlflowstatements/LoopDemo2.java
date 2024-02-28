package controlflowstatements;

import java.util.Scanner;

public class LoopDemo2 {

	public static void main(String[] args)
	{

		//accept the number from user and print the table
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		
		int i=1;
		while(i<=10)
		{
			System.out.println(num*i);
			i++;
		}
		
		System.out.println("Done!");
		
		
		System.out.println("**********************");
		
		
		int x=1;
		
		do
		{
			System.out.println("Hello");
			x++;
		}while(x==10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
