package week1_Basics;

public class DataTypesDemo {

	public static void main(String[] args)
	{
		//Primitive-->boolean 1bit true/false
		
		boolean status=true;
		System.out.println("This is boolean data: "+status);//true
		status=false;
		System.out.println("This is boolean data: "+status);//false
		//newstatus cannot be resolved to a variable
		boolean newstatus=false;
		System.out.println("This is boolean data: "+newstatus);//false

		System.out.println("**********************");
		
		/*
		 * Numeric--->character and Integral(byte-short-int-long)
		 * character takes 2byte memory
		 * 1.used to store single character
		 * 2.Used to store special character
		 * 3.Used to store ASCII value of characters
		 * Ascii =0 to 255
		 * 
		 * A-Z= 65 to 90
		 * a-z= 97 to 122
		 * 0 to 9= 48 to 57
		 *  
		 */
		
		char c1='S';
		System.out.println("Single character is: "+c1);
		
		char c2='$';
		System.out.println("Special character is: "+c2);
		
		char c3=65;//It store Ascii and return Character of Ascii
		System.out.println("Ascii 65 the character is: "+c3);//A
		
		System.out.println("***********************************");
		
		//integral--->1.Integer 2.Floating point
		//integer--->byte-->short-->int--->long
		//In java every number is integer
		//byte 1byte -128 to 127 

		
		byte b1=120;
		byte b2=127;
		//byte b3=130;//Type mismatch: cannot convert from int to byte
		System.out.println("Byte data 1 is: "+b1+"\nByte data 2: "+b2);
		byte b3=-128;
		
		byte b4=-103;
		
		System.out.println("Byte data 1 is: "+b3+"\nByte data 2: "+b4);

		//short  2byte -32768 to 32767
		short s1=300;
		short s2=30000;
		short s3=32767;
		//short s4=40000;//Type mismatch: cannot convert from int to short
		
		System.out.println("Short data is: "+s2+"\nShort data is: "+s2+"\nShort data is: "+s3);
		//int 4byte 
		
		int i1=50000;
		int i2=9867654;
		//int i3=9999999999;//The literal 9999999999 of type int is out of range 
		System.out.println("Integer data is: "+i1+"\nInteger data is: "+i2);
		
		//long 8byte Add suffix at the end of number L/l
		
		long l1=9999999999L;
		System.out.println("long data is: "+l1);
		
		
		long l2=7685544L;
		System.out.println("long data is: "+l2);
		
		System.out.println("*********************************");
		
		/*
		 * floating point
		 * 1.float 4byte 32bit  add at the end suffix F/f
		 * 2.double(default) 8byte 64bit
		 */
		
		float f1=45.67F;
		System.out.println("Float number is: "+f1);
		
		double d1=78.89;
		System.out.println("double data is: "+d1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
