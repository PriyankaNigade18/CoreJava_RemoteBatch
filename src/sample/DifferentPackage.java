package sample;

import oop.Inheritance.AccessModifierDemo;

public class DifferentPackage extends AccessModifierDemo
{

	public static void main(String[] args)
	{
		// Different package different class
		AccessModifierDemo a1=new AccessModifierDemo();
		System.out.println(a1.name);//public
		
		//protected data we can access only through subclass
		DifferentPackage d1=new DifferentPackage();
		System.out.println(d1.acno);
		System.out.println(d1.name);

	}

}
