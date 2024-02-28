package arrayDemo;

public class Array1D {

	public static void main(String[] args)
	{
		/*
		 * Array is collection of similar data types
		 * Static structure
		 * Ways:
		 * -----------
		 * 1.Using new keyword
		 * 2.Using Literal way
		 */

		//declaration of array
		int sid[]=new int[5];
		
		//initialization
		
		sid[0]=101;
		sid[1]=102;
		sid[2]=103;
		sid[3]=104;
		sid[4]=105;
		
		System.out.println("Length os array is: "+sid.length);
		
		//single data read
		System.out.println(sid[4]);//105
		System.out.println(sid[2]);//103
		//System.out.println(sid[5]);//ArrayIndexOutOfBoundsException
		
		System.out.println(sid[1]);//0
		//System.out.println(sid[-1]);
		
		System.out.println("Iterate array using simple for loop");
		
		for(int i=0;i<5;i++)
		{
			System.out.println(sid[i]);
		}
		
		System.out.println("Iterate array using  foreach loop");
		
		for(int i:sid)
		{
			System.out.println(i);
		}
		
		System.out.println("*******Array using literals******");
		
		String loc[]={"Pune","Mumbai","Satara"};
		
		System.out.println("Total length/loc: "+loc.length);//3
		
		System.out.println(loc[2]);//Satara
		
		System.out.println("Using simple for loop");
		
		for(int i=0;i<loc.length;i++) 
		{
			System.out.println(loc[i]);
		}
		System.out.println("Iterate array using  foreach loop");
		for(String i:loc)
		{
			System.out.println(i);
		}
			
		System.out.println("*************************");
		
		int marks[]={10,20,30,40,50};
		
		System.out.println(marks[0]+marks[1]);//30
			
			//total marks for array
		int total=0;
		for(int i=0;i<marks.length;i++)
		{
			total=total+marks[i];
		}
			
			
		System.out.println("Sum of array: "+total);
			
		System.out.println("Iterate array using  foreach loop");

		for(int i:marks)
		{
			System.out.println(i);
		}
		System.out.println("********************************");	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Object type array
		Object studentdata[]= {"Sarang","Pune",20,'M',87665443,89.77};
		
		System.out.println("Length is: "+studentdata.length);
		
		for(int i=0;i<studentdata.length;i++)
		{
			System.out.println(studentdata[i]);
		}
		
		System.out.println("Iterate array using  foreach loop");

		for(Object i:studentdata)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
