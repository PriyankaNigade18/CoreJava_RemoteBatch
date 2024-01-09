package week2_Basics;

public class ThisKeywordDemo3 {

	//This keyword used to invoke constructor
	
	public ThisKeywordDemo3()//0 parameter
	{	//this constructor
//		this("Priyanka");//Constructor call must be the first statement in a constructor
		System.out.println("This is default constructor");
		
		
	}
	
	public ThisKeywordDemo3(String name)//name is 1 parameter
	{
		this();//call default constructor
		System.out.println("This is parameterized constructor: "+name);
	}
	public static void main(String[] args)
	{
		ThisKeywordDemo3 t1=new ThisKeywordDemo3("Jay");
		
		

	}

}
