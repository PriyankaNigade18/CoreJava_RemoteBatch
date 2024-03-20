package arrayDemo;

import java.util.Scanner;

public class StringReplacement {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String data=sc.nextLine();
		
		System.out.println(data.replace('e','*'));
		
		
		sc.close();
		
	}

}
