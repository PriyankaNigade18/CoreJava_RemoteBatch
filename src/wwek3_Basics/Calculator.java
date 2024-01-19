package wwek3_Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator 
{
	public void add(int a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	public void sub(int a,int b)
	{
		System.out.println("Subtraction is: "+(a-b));
	}
	public void mul(int a,int b)
	{
		System.out.println("Multiplication is: "+(a*b));
	}
	public void div(int a,int b)
	{
		System.out.println("Division is: "+(a/b));
	}

	public static void main(String[] args) throws IOException
	{

		Calculator c1=new Calculator();
		
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter first number");
		String data1=br.readLine();
		int num1=Integer.parseInt(data1);

		System.out.println("Enter second number");
		String data2=br.readLine();
		int num2=Integer.parseInt(data2);
		
		c1.add(num1, num2);
		c1.sub(num1, num2);
		c1.mul(num1, num2);
		c1.div(num1, num2);
	}

}
