package controlflowstatements;

import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) 
	{

		//Print hello statement 10 time
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Hello All!");
		}
		
		System.out.println("*********************");
		
		
		//Sum of digits
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int rem,sum=0;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sum=sum+rem;
			
		}
		
		System.out.println("Sum of digits is: " + sum);
		
	//print  1 to 10
		
		int x=1;
		
		while(x<=10)
		{
			System.out.println(x);
			x++;
			
		}
		
		System.out.println("**********************");
		
		//hello 10 time
		int a=1;
		
		while(a<=10)
		{
			System.out.println("Hello");
			a++;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
