package week1_Basics;

import week2_Basics.MethodDemo;

public class FirstCode
{
	
	public static void main(String args[])
	{
		System.out.println("Hello All");
		//different class but same package
		AccessModifier a1=new AccessModifier();
		System.out.println(a1.id);
		System.out.println(a1.name);
		//System.out.println(a1.phno);
		
		MethodDemo.show();
	}

}
