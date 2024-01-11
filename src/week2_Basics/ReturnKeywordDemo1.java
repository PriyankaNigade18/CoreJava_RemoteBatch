package week2_Basics;

public class ReturnKeywordDemo1 
{
	//method without return
	public void info(String msg)
	{
		System.out.println(msg);
	}
	/*
	 * When you want to return anything from method use return keyword
	 * you have to change the return type of method as per the data type
	 * 
	 * return keyword return the result to calling function
	 * 
	 */
	public int sum(int a,int b)//a=100 b=2000
	{
		//int c=a+b;//2100
		return a+b;//return to calling function
		
	}
	
	public String msg(String m)
	{
		return m;//return to calling function
	}
	
	
	public boolean status(boolean a)
	{
		return a;//return calling function
	}
	

	public static void main(String[] args)
	{
		ReturnKeywordDemo1 r1=new ReturnKeywordDemo1();
		
		r1.info("Hello today is Sunny day");
		
		//return function call
		int res=r1.sum(100,2000);
		System.out.println(res);
		
		String data=r1.msg("Hi!");
		System.out.println(data);
		
		boolean s=r1.status(true);
		System.out.println(s);
		
		System.out.println("Status is:"+r1.status(false));
		
		
		
		


	}

}
