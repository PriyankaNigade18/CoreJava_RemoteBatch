package wwek3_Basics;

import java.util.Scanner;

public class ScannerDemo2 {

	public void display(char c,String email,String add)
	{
		System.out.println(c+" : "+email+" : "+add);
		
	}
	public static void main(String[] args)
	{
		ScannerDemo2 s2=new ScannerDemo2();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your email");
		String email=sc.nextLine();
		
		System.out.println("Enter your adderss");
		String add=sc.nextLine();
		
		System.out.println("Enter your ch");
		char ch=sc.next().charAt(0);

		
		
	
		s2.display(ch, email, add);

	}

}
