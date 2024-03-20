package oop.Polymorphism;

public class CompiletimePoly
{
	/*
	 * same name method when you reuse
	 * 1.number of arguments
	 * 2.type of argument
	 * 3.order of argument
	 */
	
	public void add()//0 parameter
	{
		int a=10,b=20;
		System.out.println("Addition is: "+(a+b));
	}
	//1.number of arguments
	public void add(int a,int b)//2 parameter
	{
		
		System.out.println("Addition is: "+(a+b));
	}

	public void add(int a,int b,int c)//3 parameter
	{
		
		System.out.println("Addition is: "+(a+b+c));
	}
	//type of argument
	public void add(double a,int b)//2 parameter
	{
		
		System.out.println("Addition is: "+(a+b));
	}
	//order of arguments
	public void add(int a,double b)//2 parameter
	{
		
		System.out.println("Addition is: "+(a+b));
	}
	

	
	public static void main(String[] args) {
		
		CompiletimePoly c1=new CompiletimePoly();
		c1.add();
		c1.add(100.11,10);
		c1.add(200,100.110);
		c1.add(100,200);
		c1.add(10,10,10);
		
		
	
		
		
		
		// TODO Auto-generated method stub

	}

}
