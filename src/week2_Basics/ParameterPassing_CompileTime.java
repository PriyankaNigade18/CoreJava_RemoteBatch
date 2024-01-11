package week2_Basics;

public class ParameterPassing_CompileTime 
{
	int id;//instance
	
	public void add()//0 parameter
	{
		int a=10,b=20;//local
		System.out.println("Addition is: "+(a+b));
		
	}
	
	public void sub(int a,int b)//2 parameter a,b are local a=100 b=50
	{
		System.out.println("Subtraction is: "+(a-b));
	}
	
	
	//constructor
	public ParameterPassing_CompileTime(int id)
	{
		this.id=id;
		System.out.println("Student id is: "+this.id);
	}
	public void mul(int a,int b)
	{
		System.out.println("Multiplication: "+(a*b));
	}

	public static void main(String[] args)
	{//calling
		ParameterPassing_CompileTime p1=new ParameterPassing_CompileTime(201);
		p1.add();
		//compile time parameter passing
		p1.sub(100,50);//2 arguments
		
		p1.mul(5,10);
		
		
		

	}

}
