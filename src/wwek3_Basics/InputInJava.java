package wwek3_Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputInJava {

	public static void main(String[] args)throws IOException
	{
		//Accept marks from the user in double/float type and print the same
		
		
		System.out.println("Enter your age");
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		
			String data=br.readLine();
			//string--->int
			int age=Integer.parseInt(data);
			System.out.println("Hello your age is: "+age);
			
			
			System.out.println("Enter your gender M/F");
			int gen=br.read();
			System.out.println("Hello...Your gender is: "+(char)gen);
		
		
		/*
		System.out.println("Enter your name");
		//BufferedReader class
		//System.in==This is input stream
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);//The constructor BufferedReader() is undefined
		String name=br.readLine();
		
		System.out.println("Hi "+name);
		
		
		
		
		
		
		
		
		
		
		
		/*
		System.out.println("Enter your name");
		
		//to read data
		int data=System.in.read();//Unhandled exception type IOException
		/*
		 * read() reads a single character and return int data
		 
		
		
		System.out.println((char)data);
		*/
	}

}
