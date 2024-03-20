package oop.Polymorphism;

public class ConstructorDemo 

{
	//Constructor can be overloaded
	
	public ConstructorDemo()
	{
		System.out.println("This is default constructor calling!");
	}
	public ConstructorDemo(String name)
	{
		System.out.println("This is parameterized constructor calling!: "+name);
	}
	public ConstructorDemo(int id)
	{
		System.out.println("This is parameterized constructor calling!: "+id);
	}
	public ConstructorDemo(String name,int id)
	{
		System.out.println("This is parameterized constructor calling!: "+name+"id is: "+id);
	}

	public static void main(String[] args) 
	{

		ConstructorDemo c1=new ConstructorDemo();
		ConstructorDemo c2=new ConstructorDemo("Swara");
		ConstructorDemo c3=new ConstructorDemo(100);
	}

}
