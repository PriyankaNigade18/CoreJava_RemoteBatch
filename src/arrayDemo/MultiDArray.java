package arrayDemo;

public class MultiDArray {

	public static void main(String[] args)
	{
		//using new keyword
		
		int arr[][]=new int[2][3];
		
		arr[0][0]=10;
		arr[0][1]=20;
		
		arr[1][0]=30;
		arr[1][1]=40;
		
		System.out.println("Number of rows: "+arr.length);
		//row-->cell
		System.out.println("Number of cells: "+arr[0].length);
		
		//single value
		System.out.println(arr[0][2]);
		
		//System.out.println(arr[2][0]);//ArrayIndexOutOfBoundsException
		
		System.out.println("Iteration using simple for loop");
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
			
		}
		
		
		System.out.println("Iteration using simple for loop");

		for(int i[]:arr)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
