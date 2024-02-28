package controlflowstatements;

import java.util.Scanner;

public class GradeScript {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks=sc.nextInt();
		
		//>=90 A   >=95 A++ otherwise B
		
		if(marks>=90)
		{
			if(marks>=95)
			{
				System.out.println("A++");
				
			}else
			{
				System.out.println("A");
			}
		}else
		{
			System.out.println("B");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
