package week2_Basics;

public class ConstructorDemo
{
	//data-instance
	int id;
	String name;
	
	
	//method
	public void display()
	{
		System.out.println("Method is calling");
		System.out.println(id);
		System.out.println(name);
	}
	
	
	//constructor declaration
	public ConstructorDemo()
	{
		System.out.println("This is default constructor calling");
		System.out.println("id is: "+id);
		System.out.println("name is: "+name);
	}
	
	//parameterized constructor
//	public ConstructorDemo(int i,String n)//i=101 n=pooja
//	{
//		System.out.println("Constructor is assigning value to instance variable");
//		id=i;
//		name=n;
//		System.out.println("id is: "+id);
//		System.out.println("name is: "+name);
//	}
	
	
	public ConstructorDemo(int id,String name)//id=101 name=pooja
	{
		System.out.println("Constructor is assigning value to instance variable");
//		id=id;
//		name=name;
		//this keyword used to refer instance variable
		this.id=id;//local data to instant data
		this.name=name;
		System.out.println("id is: "+id);
		System.out.println("name is: "+name);
	}
	public static void main(String[] args)
	{
		ConstructorDemo c1=new ConstructorDemo();//calling default constructor
		c1.display();//calling method
		
		ConstructorDemo c2=new ConstructorDemo(101,"Pooja");
		
		c2.display();//calling method	
	
		
	}

}
