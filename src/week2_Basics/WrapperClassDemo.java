package week2_Basics;

public class WrapperClassDemo {

	public static void main(String[] args) 
	{
		// Object to primitive(parse prefix)

		String s1="200";
		System.out.println(s1+100);//200100
		//string to int--->Integer
		
		int num=Integer.parseInt(s1);//exception
		
		//NumberFormatException -
		//if the string does not contain a parsable integer.
		
		System.out.println(num+100);//300
		
		
		String s2="67.11";//string to double
		System.out.println(s2+11.11);//67.1111.11
		double data=Double.parseDouble(s2);
		System.out.println(data+11.11);//78.22
		
		
		
		String s3="A";
		//string to char
		char ch1=s3.charAt(0);
		System.out.println(ch1);//A
	/*
	 * String is itself collection of characters
	 * If you want to convert string to character then 
	 * use method charAt(index of character)----char
	 * 	
	 */
		
		String ss="hello";
		char ch=ss.charAt(0);//index
		System.out.println(ch);//h
		
		
		
		
		
		
		
		
		//primitive to Object---String.valueOf()
		int x=100;
		System.out.println(x+100);//200
		//int to String
		String ss1=String.valueOf(x);
		System.out.println(ss1+100);//100100
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
