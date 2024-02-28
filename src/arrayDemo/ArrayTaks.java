package arrayDemo;

public class ArrayTaks

{
	
	public static void main(String args[])
	{
		
		int a[]= {10,20};
		int b[]= {100,100};
		
		System.out.println("First Array:");
		for(int i=0;i<2;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Second Array:");
		for(int i=0;i<2;i++)
		{
			System.out.println(b[i]);
		}
		
		
		
		//addition of two array into result array
		int result[]=new int[2];
		//addition of two array
		for(int i=0;i<2;i++) 
		{
			result[i]=a[i]+b[i];
		}
		
		//print result array
		System.out.println("Result Array:");
		int total=0;
		for(int i=0;i<2;i++)
		{
			System.out.println(result[i]);
			total=total+result[i];
		}
		
		System.out.println("Sum of array is: "+total);
		
		
		
		
	}

}
