package oop.Inheritance;



//final class Demo
class Demo
{
	final int marks=78;
	
	public final void display()
	{
		System.out.println("Marks are: "+marks);
	}
	
}
//The type FinalKeyword cannot subclass the final class Demo
public class FinalKeyword extends Demo
{
	//Cannot override the final method from Demo
//	@Override
//	public void display()
//	{
//		System.out.println("Updated by Child!");
//	}

	public static void main(String[] args) 
	{
			FinalKeyword f1=new FinalKeyword();
			//The final field Demo.marks cannot be assigned
			//f1.marks=90;
			System.out.println(f1.marks);
			f1.display();
			
			

	}

}
