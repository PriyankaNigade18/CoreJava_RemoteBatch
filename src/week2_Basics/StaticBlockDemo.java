package week2_Basics;

public class StaticBlockDemo 
{
	static String cname;
	
	//static block
	static
	{
		System.out.println("Static block is calling!");
		cname="AISSPMS";
	}
	
	//method
	public void show()
	{
		System.out.println("Method is calling!");
	}

	public static void main(String[] args)
	{
		StaticBlockDemo s1=new StaticBlockDemo();
		
		System.out.println("main() is calling!");
		s1.show();
		
		System.out.println(cname);

	}

}
