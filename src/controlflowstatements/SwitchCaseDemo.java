package controlflowstatements;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.nextLine().charAt(0);	
		
		switch (ch)
		{
		case 'a':
			System.out.println(ch+" is a vowel");
			break;
		case 'e':
			System.out.println(ch+" is a vowel");
			break;
		case 'i':
			System.out.println(ch+" is a vowel");
			break;
		case 'o':
			System.out.println(ch+" is a vowel");
			break;
		case 'u':
			System.out.println(ch+" is a vowel");
			break;

		default:
			System.out.println(ch+" is not a vowel");
			break;
		}
		
	System.out.println("Program is completed");
	
	
	}

}
