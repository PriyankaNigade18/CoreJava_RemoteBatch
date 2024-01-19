package wwek3_Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunTimeParameterPassingDemo1
{
	public void dataString(String n)
	{
		System.out.println("Hello...Your name is: "+n);
		
	}
	
	public void dataInt(int a)
	{
		System.out.println("Hello age is: "+a);
	}
	
	public void dataChar(char ch)
	{
		System.out.println("gender is: "+ch);
	}
		
	
	public void dataDouble(double marks)
	{
		System.out.println("Your marks is: "+marks);
	}
	public static void main(String[] args) throws IOException
	{
		
		RunTimeParameterPassingDemo1 r1=new RunTimeParameterPassingDemo1();
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		
		System.out.println("Enter your name: ");
		String data=br.readLine();
		//run time parameter passing
		r1.dataString(data);

		
		
		
		System.out.println("Enter your age: ");
		String d=br.readLine();
		int age=Integer.parseInt(d);
		r1.dataInt(age);
		 
		
		
		System.out.println("Enter your marks:");
		String d1=br.readLine();
		double m=Double.parseDouble(d1);
		r1.dataDouble(m);
		
		
		System.out.println("Enter your gender:");
		int num=br.read();
		r1.dataChar((char)num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
