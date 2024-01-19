package wwek3_Basics;

import java.util.Scanner;

public class MathDunctionDemo 
{
	public void min(int a,int b,int c)
	{
		int res1=Math.min(a, b);
		int res2=Math.min(res1,c);
		System.out.println("Minimum number is: "+res2);
	}

	public static void main(String[] args) 
	{
		MathDunctionDemo m1=new MathDunctionDemo();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter three numbers");
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		m1.min(n1, n2, n3);
		
		
		
		
		
		
		

	}

}
