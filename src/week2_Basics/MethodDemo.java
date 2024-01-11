package week2_Basics;

public class MethodDemo 

{
	
	public void accept()
	{
		System.out.println("Instance method is calling!");
	}
	public static void show()
	{
		System.out.println("Static method is calling!");
	}

	public static void main(String[] args)
	{

		show();
		MethodDemo.show();
		
		MethodDemo m1=new MethodDemo();
		m1.accept();
		//The static method show() from the type MethodDemo should be accessed in a static way
		m1.show();
		
		
		
		
		
		
		


	}

}
