package arrayDemo;

public class MultiDarrayTask {

	public static void main(String[] args) 
	{

		int a[][]= {{1,2},{3,4}};
		int b[][]= {{10,20},{30,40}};
		System.out.println("Iteration for Array a:");
		for(int i[]:a)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
	
		}

		System.out.println("Iteration for Array b:");
		
		for(int i[]:b)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
	
		}
		
		//created array of same size
		
			int result[][]=new int[2][2];
			
			//initialize result
			for(int i=0;i<result.length;i++)
			{
				
				for(int j=0;j<result[i].length;j++)
				{
					result[i][j]=a[i][j]+b[i][j];
				}
			}
		
			System.out.println("Iteration of result array: ");
			
			for(int i[]:result)
			{
				for(int j:i)
				{
					System.out.print(j+" ");
				}
				System.out.println();
		
			}
		
		
		
		
		
		
		
		
		
		
		
	}

}
