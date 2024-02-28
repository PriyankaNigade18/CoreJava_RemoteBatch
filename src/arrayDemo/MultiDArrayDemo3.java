package arrayDemo;

public class MultiDArrayDemo3 {

	public static void main(String[] args) 
	{
		
		Object data[][]= {{"UName","Pword"},{"Jay","test123"},{"Yash","test123"},{"Devu","test123"}};

		System.out.println("Number of rows: "+data.length);
		
		System.out.println("Number of columns: "+data[0].length);
		
		//To skip headings from array
		
		for(int i=1;i<data.length;i++)
		{
			
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
