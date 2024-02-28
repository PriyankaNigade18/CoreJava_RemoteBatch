package arrayDemo;

public class ArrayTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,30};
		int b[]= {100,200,300};
		
		int sum1=0;
		int sum2=0;
	
		System.out.println("First Array:");
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]);
			
			sum1=sum1+a[i];
			
		}		
		System.out.println("Second Array:");
		for(int i=0;i<3;i++)
		{
			System.out.println(b[i]);
			sum2=sum2+b[i];
		}
		
		
		//result array
		int result[]= {sum1,sum2};
		System.out.println("Result array is:");
		for(int i=0;i<2;i++)
		{
			System.out.println(result[i]);
			
		}
		
		
		
	}

}
