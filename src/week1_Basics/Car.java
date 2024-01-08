package week1_Basics;

public class Car 
{
	//data
	int modelno;
	String name;
	
	//function
	public void info()
	{
		System.out.println("Car Model number is: "+modelno);
		System.out.println("Car name is: "+name);
	}

	public static void main(String[] args) 
	{
		//create an object
		Car c1=new Car();//default constructor
		c1.modelno=988789;
		c1.name="Swift";
		c1.info();
		
		
		
		Car c2=new Car();//default constructor
		c2.modelno=988777;
		c2.name="Nano";
		c2.info();



	}

}
