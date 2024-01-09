package week2_Basics;

public class SataticVsInstance 
{	
	//int count=1; instance variable
	static int count=1;
	
	public SataticVsInstance ()
	{
		System.out.println(count);
		++count;
		
	}

	public static void main(String[] args) 
	{
		SataticVsInstance  s1=new SataticVsInstance ();
		SataticVsInstance  s2=new SataticVsInstance ();
		SataticVsInstance  s3=new SataticVsInstance ();
		SataticVsInstance  s4=new SataticVsInstance ();
		SataticVsInstance  s5=new SataticVsInstance ();


	}

}
