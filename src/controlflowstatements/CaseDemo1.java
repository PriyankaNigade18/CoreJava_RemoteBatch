package controlflowstatements;

import java.util.Scanner;

public class CaseDemo1 {

	int iteamA=200;
	int iteamB=80;
	int iteamC=150;
	int total;
	int bill;
	int tax;
	public void acceptorder(int a,int b,int c)
	{
		total=((iteamA*a)+(iteamB*b)+(iteamC*c));
		System.out.println("Total is: "+total);
		bill=(total*15)/100;
		System.out.println("Discounted price is: "+bill);
		tax=total%2;
		System.out.println("Final bill is: "+(total-bill+tax));
		
	}
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter quantity of iteamA:B and C");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		CaseDemo1 c1=new CaseDemo1();
		c1.acceptorder(a, b, c);
		

	}

}
