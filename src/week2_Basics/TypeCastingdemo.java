package week2_Basics;

public class TypeCastingdemo {

	public static void main(String[] args)
	{
		// primitive to primitive
		//implicit  small--->large
		
		byte b1=127;//1byte
		
		System.out.println("byte data: "+b1);
		short s1=b1;//2byte
		
		System.out.println("short data : "+s1);
		
		char c1='a';//2byte
		
		System.out.println("character data; "+c1);//a
		int x=c1;//4byte
		System.out.println("char to int conversion: "+x);//97
		
		
		int y=290;//4byte
		float f1=y;//4byte
		System.out.println("int to float: "+f1);//290.0
		
		//type must be compatible
//		boolean status=true;
//		int p=status;
		
		
		
		
		
		System.out.println("*********************");
		
		//Explicit  large size to small size
		
		long l1=99999999999L;
		System.out.println("long data is: "+l1);
		int u=(int)l1;//Type mismatch: cannot convert from long to int
		
		
		System.out.println("long to int conversion: "+u);
		
		int r=100;
		char c2=(char) r;//Type mismatch: cannot convert from int to char
		
		System.out.println("int to char conversion: "+c2);
		
		float f2=67.888F;
		System.out.println("float data: "+f2);
		int k=(int) f2;
		System.out.println("float to int conversion: "+k);//67
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		

	}

}
