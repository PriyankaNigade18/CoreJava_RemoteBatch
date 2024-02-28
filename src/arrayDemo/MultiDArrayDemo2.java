package arrayDemo;

public class MultiDArrayDemo2 {

	public static void main(String[] args)
	{

		//jagged type array
		int arr[][]= {{1,2},{3,4},{5,6,7}};
		
		System.out.println("Number of rows: "+arr.length);
		//row-->cell
		System.out.println("Number of Columns: "+arr[2].length);
		
		System.out.println("Iteration usign simple for loop");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
		System.out.println("Iteration usign for-each loop");

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
