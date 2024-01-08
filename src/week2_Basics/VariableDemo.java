package week2_Basics;

public class VariableDemo
{
	int id=101;//instance variable
	static String cname="AISSPMS";//static variable

	public void show()
	{
		System.out.println("Show() start!");
		int marks=90;//local variable
		System.out.println("College name is: "+cname);
		System.out.println("Marks from show(): "+marks);
		System.out.println("id from show(): "+id);
		System.out.println("Show() end!");
	}
	
	public static void main(String[] args)
	{
		VariableDemo v1=new VariableDemo();
		
		int marks=100;//local variable
		System.out.println("Marks from main(): "+marks);
		v1.show();
		System.out.println("id from main() using Objects: "+v1.id);
		System.out.println("College name is: "+cname);

	}

}
