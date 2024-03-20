package arrayDemo;

public class StringDemo {

	public static void main(String[] args) 
	{

		String s1="Hello";
		String s2="Hello";
		
		//we are comparing id's of object
		System.out.println(s1==s2);//true
		
		String s3="Welcome";
		
		System.out.println(s1==s3);//false
		
		String s4=new String("Hello");
		
		System.out.println(s1==s4);//false
		
		//String is an immutable class
		
		s1=s1+"hi";//new object created inside scp
		
		System.out.println(s1==s2);//false
		
		
		
		
		
		

	}

}
