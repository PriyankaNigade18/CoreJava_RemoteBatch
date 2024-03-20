package oop.Inheritance;

public class Child  extends Parent
{
	@Override
	public void color()
	{
		System.out.println("Blue");
	}
		
	public static void main(String[] args) 
	{

		Child c1=new Child();
		c1.color();//blue
		
		Parent p1=new Parent();
		p1.color();//red
		
		//Method overrides by child so it return updated result
		Parent p2=new Child();
		p2.color();//blue
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
